package com.personal.boilerplate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.personal.boilerplate.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
