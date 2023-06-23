package com.example.demo;

import com.example.demo.model.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.PersonRepository;

@SpringBootApplication
public class SpringExampleRestH2JpaApplication implements CommandLineRunner {
	
	private com.example.demo.repository.PersonRepository personRepository;
	
	

	public SpringExampleRestH2JpaApplication(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleRestH2JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		personRepository.save(new Person(1, "John", "Doe", "john.doe@email.com"));
		personRepository.save(new Person(2, "Marry", "Public", "marry.public@email.com"));
	}

}
