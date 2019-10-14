package com.example.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*has info about what URL access triggers it?
what method to run when accessed?*/

@RestController
public class HelloController {
	
	//this method needs to be call when using URL-only for GET requests
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
