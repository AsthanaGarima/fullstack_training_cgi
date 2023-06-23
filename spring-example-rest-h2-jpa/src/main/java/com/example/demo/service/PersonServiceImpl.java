package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	private final com.example.demo.repository.PersonRepository personRepository;

	



	public PersonServiceImpl(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}





	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		
		List<Person> p = personRepository.findAll();
		
		return p;
	}
	
	
}
