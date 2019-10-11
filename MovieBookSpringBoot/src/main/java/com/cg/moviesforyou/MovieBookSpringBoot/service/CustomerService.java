package com.cg.moviesforyou.MovieBookSpringBoot.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.cg.moviesforyou.MovieBookSpringBoot.dto.Booking;
import com.cg.moviesforyou.MovieBookSpringBoot.dto.Customer;
import com.cg.moviesforyou.MovieBookSpringBoot.dto.Movie;
import com.cg.moviesforyou.MovieBookSpringBoot.dto.Show;
import com.cg.moviesforyou.MovieBookSpringBoot.dto.Theatre;
import com.cg.moviesforyou.MovieBookSpringBoot.exception.UserException;

public interface CustomerService {

	public Customer addCustomer(Customer customer) throws UserException;
	public Customer validateCustomerLogin(String userName, String userPass) throws UserException;
	public List<Movie> getMovies();
	public List<Theatre> getTheatreByMovieId(Integer movieId);
	public List<Show> getShows(Integer movieId, Integer theatreSelected);
	public BigInteger getUserId(String userName);
	public Boolean addBooking(Booking booking) throws Exception;
	public List<Booking> viewBookings(BigInteger userID);
	public Boolean cancelBooking(BigInteger booking_id);
	public BigInteger getBookingId(BigInteger userId);
	public Date getReleaseDate(Integer movieId);
	public Integer getAvailableSeats(Integer showSelected);
	public Boolean updateSeats(Integer showSelected, Integer seatsLeft, Integer seatsBooked);
	public List<Customer> findAll();

}
