package com.fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.引入springSecurity
 * 2.编写springSecurity的配置类
 * 	@EnableWebSecurity   extends WebSecurityConfigureAdapter
 * 	3.控制请求的访问权限
 */
@SpringBootApplication
public class SpringbootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityApplication.class, args);
	}

}
