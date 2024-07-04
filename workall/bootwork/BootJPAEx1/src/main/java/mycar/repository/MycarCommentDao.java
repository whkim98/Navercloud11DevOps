package mycar.repository;

import lombok.AllArgsConstructor;
import mycar.data.MyCarCommentDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MycarCommentDao {
    private MycarCommentDaoInter commentDaoInter;

    public void insertComment(MyCarCommentDto dto){
        commentDaoInter.save(dto);
    }

    public void deleteComment(int idx){
        commentDaoInter.deleteById(idx);
    }

    public List<MyCarCommentDto> getAllComments(Long num){
        return commentDaoInter.getMyCarCommentList(num);
    }
}
