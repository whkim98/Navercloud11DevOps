package bit.mycar.repository;

import bit.mycar.data.MycarDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MyCarDao {

    private MyCarDaoInter myCarDaoInter;

    public List<MycarDto> getAllDatas(){
        return myCarDaoInter.findAll(Sort.by(Sort.Direction.DESC, "num"));
    }

    public void insertMycar(MycarDto dto){
        myCarDaoInter.save(dto);
    }

    public void deleteMycar(Long num){
        myCarDaoInter.deleteById(num);
    }

    public void updateMycar(MycarDto dto){
        myCarDaoInter.save(dto);
    }

}
