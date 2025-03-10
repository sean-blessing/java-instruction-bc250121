package com.mm.db;

import java.util.ArrayList;
import java.util.List;

import com.mm.model.Movie;

public class MovieListDAO implements DAO<Movie>{
	
	private List<Movie> movies = new ArrayList<>();

	@Override
	public List<Movie> getAll() {
		if (movies.size() == 0) {
			movies.add(new Movie(1, "The Godfather", 1972, "R", "Francis Ford Coppola"));
			movies.add(new Movie(2, "The Shawshank Redemption", 1994, "R", "Frank Darabont"));
			movies.add(new Movie(3, "The Dark Knight", 2008, "PG-13", "Christopher Nolan"));
			movies.add(new Movie(4, "Schindler's List", 1993, "R", "Steven Spielberg"));
			movies.add(new Movie(5, "Forrest Gump", 1994, "PG-13", "Robert Zemeckis"));
			movies.add(new Movie(6, "Star Wars", 1977, "PG", "George Lucas"));
		}
		return movies;
	}

	@Override
	public Movie getById(int id) {
		Movie m = null;
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				m = movie;
				break;
			}
		}
		return m;
	}

	@Override
	public Movie add(Movie m) {
		movies.add(m);
		return m;
	}

	@Override
	public void update(Movie m) {
		for (Movie movie: movies) {
			if (movie.getId() == m.getId()) {
				movie = m;
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				movies.remove(movie);
				break;
			}
		}
	}

}
