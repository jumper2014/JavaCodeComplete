package com.zyt.javacode.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //表明是springboot的引导类
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("启动 spring boot");
		SpringApplication.run(DemoApplication.class, args);
//		SpringApplication application = new SpringApplication(DemoApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);  //启动引导类模式 关闭
//		application.run(args);
	}

}
