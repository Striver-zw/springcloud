package com.zw.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author Administrator
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
	}
}
