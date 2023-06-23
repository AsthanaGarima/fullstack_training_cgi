package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

	
}
