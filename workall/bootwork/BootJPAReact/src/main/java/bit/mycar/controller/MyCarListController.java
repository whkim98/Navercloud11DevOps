package bit.mycar.controller;

import bit.mycar.data.MycarDto;
import bit.mycar.service.MyCarService;
import lombok.RequiredArgsConstructor;
import naver.storage.NcpObjectStorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    }

}
