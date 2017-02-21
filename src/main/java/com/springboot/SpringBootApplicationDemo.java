package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationDemo {
	public static void main(String[] args) {
		//启动springboot
		SpringApplication.run(SpringBootApplicationDemo.class, args);
	}

}


/*
 * 访问地址：http://localhost:8080/springboot
 * @SpringBootApplication：是Spring boot项目的核心注解，主要目的是
 * 开启自动配置,它主要组合了@Configuration,@EnableAutoConfiguration,
 * @ComponentScanzhujie注解
 */
