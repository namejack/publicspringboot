package com.chinacreator.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hua.tang
 * 
 * @version ����ʱ�䣺2021-9-1 ����11:02:43
 * 
 *          ��˵��
 */
@SpringBootApplication
@MapperScan("com.chinacreator.springboot.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
