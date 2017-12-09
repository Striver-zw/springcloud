package org.springcloud.eureka.order.micro;

import org.springcloud.eureka.order.micro.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class OrderService {
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	@Autowired
//	private DiscoveryClient discoveryClient;
	
	@Autowired
	private OrderFeign orderFegin;

	/**
	 * 使用负载均衡来获取服务
	 * @return
	 */
	@HystrixCommand(fallbackMethod="backMethod")
	public String queryGoods() {
		return this.orderFegin.queryGoods();
	}
//	@HystrixCommand(fallbackMethod="backMethod")
//	public  String queryGoods() {
//		String serviceId = "eureka-micro-goods"; 
//		return this.restTemplate.getForObject("http://"+serviceId+"/goods/", String.class);
//	}
//	
	
	public String backMethod() {
		return "请求失败";
	}
	
	
//	public  String queryGoods() {
//		String serviceId = "eureka-micro-goods"; 
//		List<ServiceInstance> instances = this.discoveryClient.getInstances(serviceId);
//		if(instances.isEmpty()) {
//			return null;
//		}
//		ServiceInstance serviceInstance = instances.get(0);
//		String url = serviceInstance.getHost() +":" +serviceInstance.getPort();
//		return this.restTemplate.getForObject("http://"+url+"/goods/", String.class);
//	}
}
