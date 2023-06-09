package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
