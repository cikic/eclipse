package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("getName")
	public String getName() {
		System.out.println("123");
		System.out.println("456");
		System.out.println("789");
		System.out.println("111");
		return "itheima";
	}

}
