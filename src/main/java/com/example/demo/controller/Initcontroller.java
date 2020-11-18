package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 上午10:27:35 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@RestController
public class Initcontroller {
	protected static Logger logger = LoggerFactory.getLogger(Initcontroller.class);

	/**
	 * http://localhost:9090/hello
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		logger.info("hello");
		return "Hello greetings from spring-boot2-valid";
	}

	/**
	 * http://localhost:9090/exception
	 * 
	 * @return
	 */
	@ApiOperation(value = "异常测试", httpMethod = "GET")
	@GetMapping("/exception")
	public String exception() {
		int a = 10 / 0;
		return "exception，" + a;
	}
}
