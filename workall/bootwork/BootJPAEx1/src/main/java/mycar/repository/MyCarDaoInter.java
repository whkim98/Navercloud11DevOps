package mycar.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import mycar.data.MycarDto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MyCarDaoInter extends JpaRepository<MycarDto, Long>{
    @Query(value= """
    update mycar set carname=:carname, carprice=:carprice, carcolor=:carcolor
    where num=:num
""", nativeQuery=true)
    @Modifying
    @Transactional
    public void updateMycarNoPhoto(@Param("num") Long num, @Param("carname") String carname, @Param("carprice") int carprice,
    @Param("carcolor") String carcolor);
}