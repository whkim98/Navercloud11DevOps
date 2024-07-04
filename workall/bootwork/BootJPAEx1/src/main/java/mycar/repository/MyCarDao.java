package mycar.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mycar.data.MycarDto;

@Repository
@AllArgsConstructor
public class MyCarDao{

    private MyCarDaoInter daoInter;

    //db 저장
    public void insertCar(MycarDto dto)
    {
        daoInter.save(dto);//id타입(num)이 포함되어있을경우 자동으로 update 실행,없을경우 자동으로 insert 실행
    }

    //전체목록
    public List<MycarDto> getAllCars()
    {
        return daoInter.findAll(); //추가된 순서로 반환
        //return daoInter.findAll(Sort.by(Sort.Direction.DESC,"carprice"));//가격이 비싼거부터 출력
        //return daoInter.findAll(Sort.by(Sort.Direction.ASC,"carname"));//자동차명의 오름차순
    }
}