package com.zw.service.api.service;

import org.springcloud.common.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/refactor")
public interface HelloService {

	
	@RequestMapping(value = "/p4", method= RequestMethod.GET)
	String hello(@RequestParam("name") String name) ;
	
	
	@RequestMapping(value= "/p5", method= RequestMethod.GET)
	User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
	
	@RequestMapping(value= "/p6", method= RequestMethod.POST)
	String hello(@RequestBody User user);
}
