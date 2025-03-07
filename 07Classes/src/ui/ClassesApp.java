package ui;

import model.Movie;
import util.MyConsole;

public class ClassesApp {

	public static void main(String[] args) {
		System.out.println("Welcome to classes\n");
		
		Movie m1 = new Movie(1, "Star Wars", 1977, "PG", "George Lucas");
		System.out.println(m1.toString());
		
		int id = MyConsole.promptInt("ID: ");
		String title = MyConsole.promptString("Title: ");
		int year = MyConsole.promptInt("Year: ");
		String rating = MyConsole.promptString("Rating: ");
		String director = MyConsole.promptString("Director: ");
		Movie m2 = new Movie(id, title, year, rating, director);
		
		System.out.println(m2);
		
		
		
		System.out.println("\nBye");

	}

}
