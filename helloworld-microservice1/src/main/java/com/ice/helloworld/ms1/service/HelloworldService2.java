package com.ice.helloworld.ms1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "helloworld-microservice2")
public interface HelloworldService2 {
	@GetMapping("/helloworld2/service2")
	String callService2(@RequestParam(value = "name") String name);
}
