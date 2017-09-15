package com.zw.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 注册者
 * @author Administrator
 *
 */
@EnableDiscoveryClient//注解能激活Eureka中的DiscoveryClient实现
@SpringBootApplication
public class DemoRegisterApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoRegisterApplication.class, args);
		new SpringApplicationBuilder(
				DemoRegisterApplication.class)
		.web(true).run(args);
	}
	
}
