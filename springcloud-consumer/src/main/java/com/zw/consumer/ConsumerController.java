package com.zw.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
//		String body = restTemplate.getForEntity("http://demo-register/hello", String.class).getBody();
//		System.out.println(body);
		return restTemplate.getForEntity("http://demo-register/hello", String.class).getBody();
	}
}
