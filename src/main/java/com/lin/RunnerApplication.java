package com.lin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目入口类
 * @author lxyq0908
 *
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.lin"}) //mybatis mapper或dao
@ComponentScan(basePackages = {"com.lin"}) //spring配置文件，component
public class RunnerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunnerApplication.class, args);
	}
}
