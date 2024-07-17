package bit.controller.board;

import bit.data.board.BoardDto;
import bit.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import naver.storage.NcpObjectStorageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boot/board")
public class BoardController {

    final private BoardService boardService;
    final private NcpObjectStorageService storageService;

    String bucketName="bitcamp-whkim98-123";
    String folderName="reactboard";

    @PostMapping("/upload")
    public String photoUpload(@RequestParam("upload") MultipartFile upload) {
        String photoName = storageService.uploadFile(bucketName, folderName, upload);
        return photoName;
    }

    @PostMapping("/insert")
    public void boardInsert(@RequestBody BoardDto dto){
        boardService.insertBoard(dto);
    }

    @GetMapping("/list")
    public List<BoardDto> list(){
        return boardService.getAllDatas();
    }

    @GetMapping("/detail")
    public BoardDto detail(@RequestParam("boardNum") Long boardNum){
        boardService.updateReadCount(boardNum);
        return boardService.getData(boardNum);
    }

    @GetMapping("/checkpass")
    public Map<String, Object> checkPass(@RequestParam("boardNum") Long boardNum, @RequestParam String pass){
        Map<String, Object> map = new HashMap<>();
        boolean flag = boardService.isEqualPass(boardNum, pass);

        if(flag){
            BoardDto dto = boardService.getData(boardNum);
            map.put("dto", dto);
            map.put("result", "success");
        }else{
            map.put("result", "fail");
        }
        return map;
    }

    @PostMapping("/update")
    public void update(@RequestBody BoardDto dto){
        boardService.updateBoard(dto);
    }

    @GetMapping("/deletecheckpass")
    public Map<String, Object> deletecheckPass(@RequestParam("boardNum") Long boardNum, @RequestParam String pass){
        Map<String, Object> map = new HashMap<>();
        boolean flag = boardService.isEqualPass(boardNum, pass);

        if(flag){
            String oldPhotoName = boardService.getData(boardNum).getPhoto();
            storageService.deleteFile(bucketName, folderName, oldPhotoName);
            boardService.deleteBoard(boardNum);
            map.put("result", "success");
        }else{
            map.put("result", "fail");
        }
        return map;
    }

}
