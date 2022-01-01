package com.personal.boilerplate.service;

import org.springframework.stereotype.Service;

import com.personal.boilerplate.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository repository;

	public PersonServiceImpl(PersonRepository repository) {
		this.repository = repository;
	}
	
}
