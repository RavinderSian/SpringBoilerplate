package com.personal.boilerplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personal.boilerplate.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

	private final PersonService service;

	public PersonController(PersonService service) {
		this.service = service;
	}
	
	
}
