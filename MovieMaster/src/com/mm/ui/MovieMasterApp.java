package com.mm.ui;

import com.mm.db.DAO;
import com.mm.db.MovieDBDAO;
import com.mm.model.Movie;

import util.MyConsole;

public class MovieMasterApp {
	
	//private static DAO<Movie> movieDAO = new MovieFileDAO();
	private static DAO<Movie> movieDAO = new MovieDBDAO();

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to MovieMaster App!");
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = MyConsole.promptString("Enter command: ");
			switch (command) {
				case "all":
					displayAllMovies();
					break;
				case "add":
					addMovie();
					break;
				case "del":
					deleteMovie();
					break;
				case "exit":
					break;
				default:
					MyConsole.printLine("Invalid Option. Try again.");
					break;
			}
			
		}
		
		MyConsole.printLine("\nBye");
	}
	
	private static void displayAllMovies() {
		MyConsole.printHeader("Display Movies:", "+");
		movieDAO.getAll().forEach(movie -> MyConsole.printLine(movie.toString()));	
		//movieDAO.getAll().forEach(Movie::toString);	
	}

	private static void addMovie() {
		MyConsole.printHeader("Add Movie:", "+");
		int id = MyConsole.promptInt("Movie ID: ");
		String title = MyConsole.promptString("Title: ");
		int year = MyConsole.promptInt("Year: ");
		String rating = MyConsole.promptString("Rating: ");
		String director = MyConsole.promptString("Director: ");
		movieDAO.add(new Movie(id, title, year, rating, director));
		MyConsole.printLine("Movie added.");
	}

	private static void deleteMovie() {
		MyConsole.printHeader("Delete Movie:", "+");
		int id = MyConsole.promptInt("Movie ID: ");
		movieDAO.delete(id);
		MyConsole.printLine("Movie deleted.");
	}

	private static void displayMenu() {
		MyConsole.printLine("Menu:");
		MyConsole.printLine("===================");
		MyConsole.printLine("all - Get All Movies");
		MyConsole.printLine("add - Add A Movie");
		MyConsole.printLine("del - Delete A Movie");
		MyConsole.printLine("exit");
	}

}
