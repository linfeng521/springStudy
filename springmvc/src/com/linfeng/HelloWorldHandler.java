package com.linfeng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HelloWorldHandler {
	@RequestMapping(value="/hello")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
}
