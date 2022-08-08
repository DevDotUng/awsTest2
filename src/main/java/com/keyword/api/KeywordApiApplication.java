package com.keyword.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.keyword.api.dao")
public class KeywordApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeywordApiApplication.class, args);
	}

}
