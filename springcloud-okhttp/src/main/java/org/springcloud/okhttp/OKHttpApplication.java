package org.springcloud.okhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 集成okhttp网络请求
 * @author zw
 *
 */
@SpringBootApplication
public class OKHttpApplication {

	//注入网络请求
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}

	public static void main(String[] args) {
		SpringApplication.run(OKHttpApplication.class, args);
	}
}
