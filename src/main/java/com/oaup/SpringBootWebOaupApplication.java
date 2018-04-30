package com.oaup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oaup.dao")
public class SpringBootWebOaupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebOaupApplication.class, args);
	}
}
