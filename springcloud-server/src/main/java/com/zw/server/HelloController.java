package com.zw.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HelloController {
//	
////	@Value("${zw.anh.uyh}")
//	private String name;
//	
//	@RequestMapping("/hello")
//	public String index() {
//		return "Hello World"+name;
//	}
//	
//	@Autowired
//	private CounterService counterService;
//	@RequestMapping("/hello2")
//	public String greet() {
//	counterService.increment("didispace.hello.count");
//	return "";
//	}
//}
