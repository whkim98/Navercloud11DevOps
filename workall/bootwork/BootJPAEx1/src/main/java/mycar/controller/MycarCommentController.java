package mycar.controller;

import lombok.RequiredArgsConstructor;
import mycar.data.MyCarCommentDto;
import mycar.data.MycarDto;
import mycar.repository.MycarCommentDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mycar")
public class MycarCommentController {
    final private MycarCommentDao commentDao;

    @GetMapping("/addcomment")
    public void addComment(@RequestParam("num") Long num,
                           @RequestParam("comment") String comment){
        MycarDto dto = MycarDto.builder().num(num).build();

        MyCarCommentDto commentDto = MyCarCommentDto.builder()
                .comment(comment)
                .mycar(dto)
                .build();

        commentDao.insertComment(commentDto);
    }

    @GetMapping("/commentlist")
    public List<MyCarCommentDto> commentList(@RequestParam("num") Long num){
        return commentDao.getAllComments(num);
    }

    @GetMapping("/commdel")
    public void commentDelete(@RequestParam("idx") int idx){
        commentDao.deleteComment(idx);
    }
}
