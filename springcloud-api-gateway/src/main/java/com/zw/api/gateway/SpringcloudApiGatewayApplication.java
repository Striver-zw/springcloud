package com.zw.api.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zw.api.gateway.fifle.AccessFilter;

/**
 * @author Administrator
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class SpringcloudApiGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringcloudApiGatewayApplication.class).web(true) .run(args);
	}
	
	/**
	 * 加载过滤器 需要加验证
	 * http://localhost:5555/api-a/hello?accessToken=token
	 * @return
	 */
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
