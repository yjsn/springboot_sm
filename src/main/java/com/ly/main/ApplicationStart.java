package com.ly.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


/**
 * 
 * @Description:项目启动类
 * @author liuyang
 * @data  2017-6-17 上午10:12:46
 *
 */
@SpringBootApplication
@ComponentScan(value={"com.ly"})
@MapperScan("com.ly.dao")
@EnableAutoConfiguration  
public class ApplicationStart {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
