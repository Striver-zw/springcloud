package org.springcloud.okhttp.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OKHtppControllor {

	@Autowired
	private RestTemplate restTemplate;
	
//	@Value("${singleton.config.url}")
//	private String url;
	
	@Autowired
	private ProperConfig properConfig;
	
	@GetMapping("index")
	public String index() {
		return this.restTemplate.getForObject(properConfig.getConfig().getUrl(), String.class);
	}
}
