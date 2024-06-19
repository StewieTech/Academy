package com.bptn.course.week2.connectFour;

import java.util.Scanner;

/**
The player class is concerned with descibing a player and things that relate to it. It keeps track of the name of a player, the order of the player in relation to other players in the game, and the move the player may want to make (which is just as simple as the user picking which column of the board they want their token to be dropped in). This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on the specification we've received.
*/
public class Player {

private String name;
private int playerNumber;
// Add other instance variable(s)

// Question: should scanner be static or not?
private static Scanner scanner =  new Scanner(System.in);// complete line

public Player(String name, int playerNumber) {
	// I believe that playerNumber should be an int not a string
    // complete constructor
	this.name = name;
	this.playerNumber = playerNumber;
}

// create getter methods

public int makeMove() {
    System.out.println("Make your move. What column do you want to put a token in?");
    int column = scanner.nextInt();// receive user input
    return column;
}

public String getName() {
	return name;
}

public int getPlayerNumber() {
	return playerNumber;
	// possible exception made for only player 1 or 2
}

public String toString() {
    return ("Player " + playerNumber + " is " + name);
}
}
