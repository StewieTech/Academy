package com.bptn.course.week3.TB;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class AvengersTB {
    public static void main(String[] args) {
        // Initialize movie list
        List<String> marvelMovieList = initializeMovieList();

        // Print movie watchlist
        printMovieWatchlist(marvelMovieList);

        // Initialize movie lengths and earnings
        ArrayList<Integer> movieLengths = initializeMovieLengths();
        ArrayList<Double> movieEarnings = initializeMovieEarnings();

        // Combine movie details
        List<String> movieDetailsList = combineMovieDetails(marvelMovieList, movieLengths, movieEarnings);

        // Print movie details in reverse order
        printMoviesInReverseOrder(movieDetailsList);

        // Remove the last movie and print the remaining list
        removeLastMovieAndPrintTop4(movieDetailsList);
    }

    // Method to initialize movie list
    private static List<String> initializeMovieList() {
        List<String> marvelMovieList = new ArrayList<>();
        marvelMovieList.add("Avengers Endgame");
        marvelMovieList.add("Avengers Infinity War");
        marvelMovieList.add("Spider-Man No Way Home");
        marvelMovieList.add("The Avengers");
        marvelMovieList.add("Black Panther");
        return marvelMovieList;
    }

    // Method to print movie watchlist
    private static void printMovieWatchlist(List<String> marvelMovieList) {
//  	Simple for loop to traverse the marvelMovieList
		for (int i = 0; i < marvelMovieList.size(); i++ ) {
			System.out.println((i+1)+ ": "+ marvelMovieList.get(i));
		}
    }
		
    // Method to initialize movie lengths
    private static ArrayList<Integer> initializeMovieLengths() {
        ArrayList<Integer> movieLengths = new ArrayList<>();
        movieLengths.add(181); // Endgame
        movieLengths.add(149); // Infinity War
        movieLengths.add(148); // No Way Home
        movieLengths.add(143); // The Avengers
        movieLengths.add(134); // Black Panther
        return movieLengths;
    }

    // Method to initialize movie earnings
    private static ArrayList<Double> initializeMovieEarnings() {
        ArrayList<Double> movieEarnings = new ArrayList<>();
        movieEarnings.add(2.798); // Endgame (in billions)
        movieEarnings.add(2.048); // Infinity War (in billions)
        movieEarnings.add(1.901); // No Way Home (in billions)
        movieEarnings.add(1.519); // The Avengers (in billions)
        movieEarnings.add(1.349); // Black Panther (in billions)
        return movieEarnings;
    }

    // Method to combine movie details
    private static List<String> combineMovieDetails(List<String> marvelMovieList, ArrayList<Integer> movieLengths, ArrayList<Double> movieEarnings) {
        List<String> movieDetailsList = new ArrayList<>();
        ListIterator<String> ite = marvelMovieList.listIterator();
        Iterator<Integer> iteLength = movieLengths.iterator();
        Iterator<Double> iteEarnings = movieEarnings.iterator();
        System.out.println("\nMovies with Lengths and Earnings:");
        while (iteLength.hasNext()) {
            String movieDetails = ite.next() + ": Minutes " + iteLength.next() + " Earned " + iteEarnings.next();
            movieDetailsList.add(movieDetails);
        }
        return movieDetailsList;
    }

    // Method to print movies in reverse order
    private static void printMoviesInReverseOrder(List<String> movieDetailsList) {
        System.out.println("\nMovies In Reverse Order");
        ListIterator<String> iteDetail = movieDetailsList.listIterator(movieDetailsList.size());
        while (iteDetail.hasPrevious()) {
            System.out.println(iteDetail.previous());
        }
    }

    // Method to remove the last movie and print the top 4
    private static void removeLastMovieAndPrintTop4(List<String> movieDetailsList) {
        movieDetailsList.remove(movieDetailsList.size() - 1);
        System.out.println("\nTop 4 (One Removed)");
        movieDetailsList.forEach(str -> System.out.println(str));
    }
}
