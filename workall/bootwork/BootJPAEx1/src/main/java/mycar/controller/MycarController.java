package mycar.controller;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import mycar.data.MycarDto;
import mycar.repository.MyCarDao;
import naver.storage.NcpObjectStorageService;

@Controller
@RequiredArgsConstructor
public class MycarController {
    private final MyCarDao myCarDao;
    private final NcpObjectStorageService storageService;

    //bucket 명
    String bucketName="bitcamp-whkim-123";
    //업로드할 폴더명
    String folderName="mycar";

    @GetMapping("/")
    public String home()
    {
        return "redirect:./mycar/list";
    }

    int pageSize;
    @GetMapping("/mycar/list")
    public String list(Model model, @RequestParam(value = "more", defaultValue = "0") int more)
    {
        if(more == 0){
            pageSize = 3;
        }else{
            pageSize += more;
        }

        Pageable pageable = PageRequest.of(0, pageSize, Sort.by("num").ascending());

        Page<MycarDto> result = myCarDao.getAllCars(pageable);

        model.addAttribute("totalCount", result.getTotalElements());
        model.addAttribute("totalPage", result.getTotalPages());
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("list", result.getContent());
        return "mycar/mycarlist";
    }

    @GetMapping("/mycar/form")
    public String form()
    {
        return "mycar/mycarform";
    }

    @PostMapping("/mycar/insert")
    public String insertCar(@ModelAttribute MycarDto dto,
                            @RequestParam("carupload") MultipartFile carupload
    )
    {
        //사진을 업로드후 업로드된 파일명 반환
        String carphoto=storageService.uploadFile(bucketName, folderName, carupload);
        dto.setCarphoto(carphoto);
        //db insert
        myCarDao.insertCar(dto);

        return "redirect:./list";
    }

    @GetMapping("/mycar/detail")
    public String detail(@RequestParam Long num, Model model){
        MycarDto dto = myCarDao.getData(num);
        model.addAttribute("dto", dto);
        return "mycar/mycardetail";
    }

    @PostMapping("/mycar/update")
    public String update(@ModelAttribute("dto") MycarDto dto, @RequestParam("carupload") MultipartFile carupload){
        if(carupload.getOriginalFilename().equals("")){
            dto.setCarphoto("no");
        }else{
            String oldPhotoname = myCarDao.getData(dto.getNum()).getCarphoto();
            storageService.deleteFile(bucketName, folderName, oldPhotoname);
            String photo = storageService.uploadFile(bucketName, folderName, carupload);
            dto.setCarphoto(photo);
        }

        myCarDao.updateCar(dto);
        return "redirect:./detail?num=" + dto.getNum();
    }

    @GetMapping("mycar/carupdate")
    public String updateForm(@RequestParam("num") Long num, Model model){
        MycarDto dto = myCarDao.getData(num);
        model.addAttribute("dto", dto);
        return "mycar/mycarupdateform";
    }

    @GetMapping("/mycar/delete")
    public String delete(@RequestParam("num") Long num, Model model){
        String photoname = myCarDao.getData(num).getCarphoto();
        storageService.deleteFile(bucketName, folderName, photoname);
        myCarDao.deleteCar(num);
        return "redirect:./list";
    }
}