package org.springcloud.eureka.goods.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsControll {
	
	@Autowired
	private JdbcConfigBean jdbcConfigBean;
	
	@GetMapping("config")
	public String config() {
		return jdbcConfigBean.toString();
	}
	

	@GetMapping("goods")
	public String goods() {
		return "{ok}";
	}
}
