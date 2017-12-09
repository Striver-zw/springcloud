package org.springcloud.eureka.order.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControll {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("order")
	public String goods() {
		return orderService.queryGoods();
	}
}
