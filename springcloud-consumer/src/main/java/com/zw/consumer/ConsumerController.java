package com.zw.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

//	@Autowired
//	RestTemplate restTemplate;
//
//	/**
//	 * 调用服务
//	 * @return
//	 */
//	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
//	public String helloConsumer() {
//		//与配置一致
//		return restTemplate.getForEntity(URLUtils.rpcURL, String.class).getBody();
//	}
//	
//	/**
//	 * post请求
//	 * @return
//	 */
//	@RequestMapping(value = "/ribbon-consumer-post", method = RequestMethod.POST)
//	public String POST() {
//		String jsonStr = "kk";
//		if (null != jsonStr) {
//			HttpHeaders headers = new HttpHeaders();
//			MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//			headers.setContentType(type);
//			HttpEntity<String> formEntity = new HttpEntity<String>(jsonStr, headers);
//			String result = restTemplate.postForEntity(URLUtils.rpcURL, formEntity, String.class).getBody();
//			return result;
//		}
//		return null;
//	}
	
	@Autowired
	HelloService helloService;
	
	/**
	 * 使用容错的机制
	 * @return
	 */
	@RequestMapping(value= "/ribbon-consumer", method= RequestMethod.GET)
	public R helloConsumer() {
		return helloService.helloService();
	}
}
