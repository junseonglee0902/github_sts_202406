package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubProjectApplication.class, args);
		System.out.println("github 연동 프로젝트 테스트");
		System.out.println("sub1 브랜치 조원 추가 테스트");
	}

}
