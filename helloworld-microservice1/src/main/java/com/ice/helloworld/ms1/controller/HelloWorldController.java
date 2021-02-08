package com.ice.helloworld.ms1.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ice.helloworld.ms1.service.HelloworldService2;

@RestController
public class HelloWorldController {

	private Logger logger = Logger.getLogger(HelloWorldController.class.getName());
	
	@Autowired
	private HelloworldService2 hws2;

	@GetMapping("/helloworld1/service1")
	public ResponseEntity<String> getGreeting(@RequestParam("name") String name) {
		logger.info("Service1 calling Service2.....");
		return new ResponseEntity<String>(hws2.callService2(name), HttpStatus.OK);
	}
}
