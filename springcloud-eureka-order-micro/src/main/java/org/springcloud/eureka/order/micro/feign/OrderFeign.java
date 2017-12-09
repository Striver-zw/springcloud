package org.springcloud.eureka.order.micro.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="eureka-micro-goods")//指定服务id
public interface OrderFeign {

	/**
	 * 与springmvc 方式一样
	 * 借助spring的方式  减低学习成品
	 * @return
	 */
	@RequestMapping(value="/goods/",method=RequestMethod.GET)
	public  String queryGoods() ;
}
