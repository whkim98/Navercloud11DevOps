package bit.mycar.controller;

import bit.mycar.data.MycarDto;
import bit.mycar.service.MyCarService;
import lombok.RequiredArgsConstructor;
import naver.storage.NcpObjectStorageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MyCarListController {
    final MyCarService myCarService;
    final NcpObjectStorageService storageService;

    private String bucketName="bitcamp-whkim-123";
    private String folderName="mycar";

    @GetMapping("/mycar/list")
    public List<MycarDto> list(){
        return myCarService.getAllDatas();
    }

    @PostMapping("/mycar/upload")
    public Map<String, String> uploadPhoto(@RequestParam("upload") MultipartFile upload){
        System.out.println("photo upload>>" + upload.getOriginalFilename());
        String carphoto = storageService.uploadFile(bucketName, folderName, upload);
        Map<String, String> map = new HashMap<>();
        map.put("carphoto", carphoto);
        return map;
    }

    @PostMapping("/mycar/insert")
    public void insert(@RequestBody MycarDto dto){
        System.out.println("insert dto >>" + dto);
        myCarService.insertMycar(dto);
    }

}
