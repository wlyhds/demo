package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DemoApplication {
	
	@RequestMapping("/hello")
	@ResponseBody
	public Object hello() {
		return "hello world";
	}
	
	@RequestMapping("/")
	public String index() {
	    return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
