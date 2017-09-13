package com.zw.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 注册者
 * @author Administrator
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRegisterApplication.class, args);
	}
}
