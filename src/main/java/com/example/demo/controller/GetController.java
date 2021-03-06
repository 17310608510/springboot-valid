package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseDTO;
import com.example.demo.dto.GetUserByIdDTO;
import com.example.demo.exception.ParamaErrorException;
import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 上午10:28:42 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@RestController
@RequestMapping("/api/")
@Api(tags = { "查询接口" })
@Slf4j
public class GetController {
	/**
	 * 测试Post请求
	 */
	@ApiOperation(value = "TestPost接口", httpMethod = "POST")
	@PostMapping("/test/post")
	public JsonResult testPost(@Valid @RequestBody BaseDTO<GetUserByIdDTO> dto) {
		log.debug("enter test post api...");
		return new JsonResult(ResultCode.SUCCESS);
	}

	/**
	 * 测试Get请求
	 */
	@Validated
	@ApiOperation(value = "TestGet接口", httpMethod = "GET")
	@GetMapping("/test/get/{userName}")
	public JsonResult testGet(@PathVariable String userName) {
		log.debug("enter test get api...");
		if (userName == null || "".equals(userName)) {
			throw new ParamaErrorException("userName 不能为空");
		}
		return new JsonResult(ResultCode.SUCCESS);
	}

}
