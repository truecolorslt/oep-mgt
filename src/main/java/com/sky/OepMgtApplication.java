package com.sky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sky.mapper") // 必须加这个，不加报错，如果不加，也可以在每个mapper上添加@Mapper注释
public class OepMgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OepMgtApplication.class, args);
	}

}
