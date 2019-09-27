package com.service.documentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
	
	@GetMapping(value="/hi")
	public String hi()
	{
		System.err.println("hghghgh");
		return "hi";
	}

}
