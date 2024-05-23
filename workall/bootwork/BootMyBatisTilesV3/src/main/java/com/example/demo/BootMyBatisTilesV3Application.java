package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"*.member", "data.*"})
@MapperScan("data.mapper")
public class BootMyBatisTilesV3Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMyBatisTilesV3Application.class, args);
	}

}
