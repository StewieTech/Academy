package com.bptn.course.week3.TB;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class AvengersDemo {
	public static void main(String[] args) {
		
		// Example 1
		// Adding movies to Marvel Movie Array List
		List<String> marvelMovieList = new ArrayList<>();
		marvelMovieList.add("Avengers Endgame");
		marvelMovieList.add(null);
		marvelMovieList.add("Spider-Man No Way Home");
		marvelMovieList.add("The Avengers");
		marvelMovieList.add("Black Panther");

//  	Simple for loop to traverse the marvelMovieList
		System.out.println("I) Marvel Movies Watchlist: "); // print
		for (int i = 0; i < marvelMovieList.size(); i++ ) {
			System.out.println((i+1)+ ": "+ marvelMovieList.get(i));  // print
		}
		
		// Example 2 List iterator
		ListIterator<String> ite = marvelMovieList.listIterator();
		System.out.println("\nII) Movies Watchlist with ListIterator: ");  //print
		int numCount = 0; 
		 while (ite.hasNext() ) {
		 	System.out.println((numCount+1)+ ": "+ ite.next()); // print whole section
		 	numCount++;
		 }

		 // Example 3: Demonstrating ArrayList maintain the same order
		ArrayList<Integer> movieLengths = new ArrayList<>();
		ArrayList<Double> movieEarnings = new ArrayList<>();
        movieLengths.add(181); // Endgame
        movieLengths.add(149); // Infinity War
        movieLengths.add(148); // No Way Home
        movieLengths.add(143); // The Avengers
        movieLengths.add(134); // Black Panther
        movieEarnings.add(2.798); // Endgame (in billions)
        movieEarnings.add(2.048); // Infinity War (in billions)
        movieEarnings.add(1.901); // No Way Home (in billions)
        movieEarnings.add(1.519); // The Avengers (in billions)
        movieEarnings.add(1.349); // Black Panther (in billions)

		// Defining an Iterator for Each
        Iterator<String> iteList = marvelMovieList.iterator();
		Iterator<Integer> iteLength = movieLengths.iterator();
		Iterator<Double> iteEarnings = movieEarnings.iterator();
		
		// Defining a Movie Details Variable as well as a new array
		List<String> movieDetailsList = new ArrayList<>();
		String movieDetails = "";

		// 
		 System.out.println("\nIII) Movies with Lengths and Earnings:");
		while (iteLength.hasNext()) {
			movieDetails = iteList.next() + ": Minutes " + iteLength.next() + " Earned " + iteEarnings.next() ;
			movieDetailsList.add(movieDetails);
		}
		
		movieDetailsList.forEach(str-> System.out.println(str));
		
		// Example 4
		// Print out Movies in Reverse Order
		System.out.println("\nIV) Movies In Reverse Order");
		ListIterator<String> iteDetail = movieDetailsList.listIterator(movieDetailsList.size());
		while (iteDetail.hasPrevious()) {
			System.out.println(iteDetail.previous());	
		}
		
		// Example 5
        // Remove one movie using ListIterator and print out top 4
        iteDetail = movieDetailsList.listIterator(movieDetailsList.size());
        if (iteDetail.hasPrevious()) {
            iteDetail.previous();
            iteDetail.remove();
        }
		
        System.out.println("\nV) Top 4 (One Removed)");
        movieDetailsList.forEach(str-> System.out.println(str));
		
		
		
//		
//		movieDetailsList.remove(movieDetailsList.size() -1);
		

		



	}


}
