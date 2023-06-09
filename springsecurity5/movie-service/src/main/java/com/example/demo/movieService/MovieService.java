package com.example.demo.movieService;

import java.util.Optional;

import com.example.demo.model.Movie;

public interface MovieService {

	public Movie createMovie(Movie movie);
	
	public  Iterable<Movie> fetchAllMovie();
	public  Optional<Movie> findMovieById(int id);
	public Optional<Movie> deleteMovieById(int id);
	public Movie updateById(int id, Movie movie);
}
