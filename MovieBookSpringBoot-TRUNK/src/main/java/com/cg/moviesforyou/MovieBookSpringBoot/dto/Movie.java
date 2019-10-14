package com.cg.moviesforyou.MovieBookSpringBoot.dto;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "movie")
	public class Movie {
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="movie_id")
		private Integer movieId;
		
		@NotEmpty(message = "Can not be empty!")
		@Column(name="movie_name")
		private String movieName;
		
		@NotEmpty(message = "Can not be empty!")
		@Column(name="movie_genre")
		private String genre;
		
		@NotEmpty(message = "Can not be empty!")
		@Column(name="movie_director")
		private String director;
		
		@Pattern(regexp = "^[0-9]+$", message = "Must contain only digits")
		@Column(name="movie_length")
		private Integer movieLength;
		
		@NonNull
		@Future
		@Column(name="movie_release_date")
		@Temporal(TemporalType.DATE)
		private Date movieReleaseDate;
		
		@NonNull
		@Column(name="movie_language")
		private String language;
		
		@Column(name="delete_flag")
		private Integer flag=0;
		
		@Column(name="show_status")
		private Integer showStatus=0;
		
		@ManyToMany(cascade = CascadeType.MERGE)
		@JoinTable(joinColumns = @JoinColumn(name = "movie_fk"), inverseJoinColumns = @JoinColumn(name = "theatre_fk"))
		private List<Theatre> theatre;
		@OneToMany(mappedBy = "movie")
		private List<Show> showsList;
		
		public Movie() {
			
		}
		
		public Movie(Integer movieId, String movieName, String genre, String director, Integer movieLength,
				Date movieReleaseDate, String language, Integer flag, Integer showStatus, List<Theatre> theatre,
				List<Show> showsList) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.genre = genre;
			this.director = director;
			this.movieLength = movieLength;
			this.movieReleaseDate = movieReleaseDate;
			this.language = language;
			this.flag = flag;
			this.showStatus = showStatus;
			this.theatre = theatre;
			this.showsList = showsList;
		}

		public Integer getMovieId() {
			return movieId;
		}

		public void setMovieId(Integer movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public Integer getMovieLength() {
			return movieLength;
		}

		public void setMovieLength(Integer movieLength) {
			this.movieLength = movieLength;
		}

		public Date getMovieReleaseDate() {
			return movieReleaseDate;
		}

		public void setMovieReleaseDate(Date movieReleaseDate) {
			this.movieReleaseDate = movieReleaseDate;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public Integer getFlag() {
			return flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public Integer getShowStatus() {
			return showStatus;
		}

		public void setShowStatus(Integer showStatus) {
			this.showStatus = showStatus;
		}

		public List<Theatre> getTheatre() {
			return theatre;
		}

		public void setTheatre(List<Theatre> theatre) {
			this.theatre = theatre;
		}

		public List<Show> getShowsList() {
			return showsList;
		}

		public void setShowsList(List<Show> showsList) {
			this.showsList = showsList;
		}
		
				
	}

