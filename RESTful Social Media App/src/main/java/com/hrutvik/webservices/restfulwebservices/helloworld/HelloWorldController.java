package com.hrutvik.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hrutvik.webservices.restfulwebservices.HelloWorldBean;

//Controller - Handles HTTP Request
@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method -- "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	
	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/path-variable/hrutvik
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World %s",name));
	}

}
