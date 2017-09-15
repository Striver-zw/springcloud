package com.zw.consumer;

import org.springcloud.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 加入容错机制
 * @author Administrator
 *
 */
@Service
public class HelloService {
//	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	RestTemplate restTemplate;

	//知道回调的方法
	@HystrixCommand(fallbackMethod = "helloFallback",commandKey="helloKey")
	public R helloService() {
//		long start = System.currentTimeMillis();
//		
//		long end= System.currentTimeMillis();
//		logger.info("Spend time : "+ (end - start));
		return restTemplate.getForEntity(URLUtils.rpcURL, R.class).getBody();
	}

	public R helloFallback () {
		return R.error("服务宕机了");
	}
}
