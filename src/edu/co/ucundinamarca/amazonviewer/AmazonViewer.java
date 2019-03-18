package edu.co.ucundinamarca.amazonviewer;
import java.util.Scanner;

import edu.co.ucundinamarca.amazonviewer.models.Movie;

import java.util.ArrayList;
import java.util.Date;

public class AmazonViewer {

	public static void main(String[] args){
		showMenu();
		
	}

	public static void showMenu() {
		byte option = 0;

		Scanner sc = new Scanner(System.in);
		
		do {	
			System.out.println();
			System.out.println("selecciona una opción.");
			System.out.println("Welcome to Amazon Viewer");
			System.out.println("");
			System.out.println("What do you want to see?");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Documentals");
			System.out.println("4. Tv shows");
			System.out.println("5. Report");
			System.out.println("6. Report today");
			System.out.println("0. Exit");
		
			option = Byte.valueOf(sc.nextByte());
			
			switch (option) {

			case 1:

				showMovies();
				break;

			case 2:

				showSeries();
				break;

			case 3:

				showBooks();
				break;

			case 4:

				showMagazines();
				break;

			case 5:

				makeReport();
				break;

			case 6:

				Date date = new Date();
				makeReport(date);

			case 0:

				System.out.println("------------------------------------");
				System.out.println("              Bye bye!              ");
				System.out.println("------------------------------------");

				break;
			default:

				System.out.println();
				System.out.println("Unavailable option.\nTry again.");
				System.out.println();

				break;
			}

		}while(option!=0);

		sc.close();
	}

	public static void showMovies() {
		
		Scanner sc = new Scanner(System.in);
		
		byte option;
		
		ArrayList<Movie> movies = Movie.makeMoviesList();
		
		do {
			System.out.println("");
			System.out.println(":: Welcome to Amazon Movies ::");
			System.out.println("");
			System.out.println("Here you get a list of movies in Amazon movies.");
			
			
			System.out.println("You can watch a movie or go back using the menu");
			
			for (int i = 0; i < movies.size() ; i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Exit");
			
			option = Byte.valueOf(sc.nextLine());
			
			if(option == 0)
				showMenu();
			
			Movie movieSelected = movies.get(option-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println(".............................");
			}
			
			movieSelected.stopToSee(dateI, new Date());
			
			System.out.println("You saw: ");
			System.out.println(movieSelected);
			System.out.println("during:\t" + movieSelected.getTimeViewed() + "miliseconds");
			
		}while(option != 0);
		sc.close();
		
	}

	public static void showSeries() {
		System.out.println("");
		System.out.println(":: Welcome to Amazon Series ::");
		System.out.println("");
		System.out.println("here you get a list of series in Amazon series.");

	}

	public static void showChapters() {
		System.out.println("");
		System.out.println(":: Welcome to Amazon series ::");
		System.out.println("");
		System.out.println("here you get a list of chapters in XXXXXXXXX serie.");

	}

	public static void showBooks() {
		System.out.println("");
		System.out.println(":: Welcome to Amazon Books ::");
		System.out.println("");
		System.out.println("here you get a list of books in Amazon books.");

	}

	public static void showMagazines() {
		System.out.println("");
		System.out.println(":: Welcome to Amazon Magazines ::");
		System.out.println("");
		System.out.println("here you get a list of magazines in Amazon magazines.");

	}

	public static void makeReport() {
		System.out.println("");
		System.out.println(":: Welcome to Amazon Viewer ::");
		System.out.println("");
		System.out.println("here you get a report of your activity in Amazon Viewer.");

	}

	public static void makeReport(Date date) {
		System.out.println("");
		System.out.println(":: Welcome to Amazon Viewer ::");
		System.out.println("");
		System.out.println("here you get a Report of your activity today");

	}

}
