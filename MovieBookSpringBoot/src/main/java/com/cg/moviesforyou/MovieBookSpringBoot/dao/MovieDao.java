package com.cg.moviesforyou.MovieBookSpringBoot.dao;

import java.util.List;

import com.cg.moviesforyou.MovieBookSpringBoot.dto.Movie;

public interface MovieDao {
	public Movie save(Movie novie);
	public List<Movie> findAll();
	public Movie find(Integer movieId);
	public Movie remove(Integer movieId);
}
