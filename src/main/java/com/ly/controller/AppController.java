package com.ly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class AppController {

	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "hello word";
	}
}
