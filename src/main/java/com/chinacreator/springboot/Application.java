package com.chinacreator.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hua.tang
 * 
 * @version 创建时间：2021-9-1 上午11:02:43
 * 
 *          类说明
 */
@SpringBootApplication
@MapperScan("com.chinacreator.springboot.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
