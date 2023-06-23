package com.example.demo.movieService;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService{
	
	public final MovieRepository movieRepository;

	@Override
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.save(movie);
	}


	@Override
	public Iterable<Movie> fetchAllMovie() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}


	@Override
	public Optional<Movie> findMovieById(int id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id);
	}


	@Override
	public Optional<Movie> deleteMovieById(int id) {
		// TODO Auto-generated method stub
		 Optional<Movie> movie = movieRepository.findById(id);
		 if (movie.isPresent()) {
			 movieRepository.deleteById(id);
			 return movie;
		 }
		 else {
			 return null;
		 }
		 
	}


	@Override
	public Movie updateById(int id, Movie movie) {
		// TODO Auto-generated method stub
		Optional<Movie> movies =  movieRepository.findById(null);
		if (movies.isPresent()) {
			Movie m = movies.get();
			m.setMovieName(movie.getMovieName());
			m.setGenre(movie.getGenre());
			movieRepository.save(m);
			return movie;

		}
		else {
			return null;
		}
	}


	
	
}
