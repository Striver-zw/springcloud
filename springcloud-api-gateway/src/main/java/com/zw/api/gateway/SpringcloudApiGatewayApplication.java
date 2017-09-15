package com.zw.api.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 241
 * @author Administrator
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringcloudApiGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringcloudApiGatewayApplication.class).web(true) .run(args);
	}
}
