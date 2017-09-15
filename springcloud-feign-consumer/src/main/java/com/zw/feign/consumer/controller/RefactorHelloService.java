package com.zw.feign.consumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.zw.feign.consumer.service.HelloService;

@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {


}
