package com.zw.service;

import org.jboss.logging.Logger;
import org.springcloud.common.R;
import org.springcloud.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
	
	/**
	 * 方括号中的eureka-client就是通过Spring Cloud定义的DiscoveryClient接口在eureka的实现中获取到的所有服务清单
	 */
	@Autowired
	private  DiscoveryClient client;
	
	@RequestMapping(value = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
	public R index() throws Exception {
		@SuppressWarnings("deprecation")
		ServiceInstance instance = client.getLocalServiceInstance();
//		//测试效果 使用线程等待几秒
//		int sleepTime= new Random().nextInt(3000);
//		logger.info("sleepTime:" + sleepTime);
//		Thread.sleep(sleepTime);
//
//		logger.info("/hello, host:" + instance.getHost() + "     service id:" + instance.getServiceId());
//		
		return R.ok("远程服务信息，"+instance.getPort());
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/dc")
	public R test() throws Exception {
		String services = "Services: " + client.getServices();
		logger.info(services);
		return R.ok(services);
	}
	
	
	@RequestMapping(value= "/p", method= RequestMethod.GET)
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}
	
	
	@RequestMapping(value= "/p2", method= RequestMethod.GET)
	public User hello(@RequestHeader String name, @RequestHeader Integer age) {
		return new User(name, age);
	}
	
	@RequestMapping(value= "/p3", method = RequestMethod.POST)
	public String hello(@RequestBody User user) {
		return "Hello "+ user.getName() + ", " + user. getAge();
	}

}
