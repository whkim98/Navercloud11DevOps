package bit.service.mycar;

import bit.data.mycar.MycarDto;
import bit.repository.mycar.MyCarDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MyCarService {
    private MyCarDao myCarDao;

    public List<MycarDto> getAllDatas(){
        return myCarDao.getAllDatas();
    }

    public void insertMycar(MycarDto dto){
        myCarDao.insertMycar(dto);
    }

    public void deleteMycar(Long num){
        myCarDao.deleteMycar(num);
    }

    public void updateMycar(MycarDto dto){
        myCarDao.updateMycar(dto);
    }

}
