package rock.paper.scissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		// declare variables
		Random rGen = new Random();
		Scanner scan = new Scanner(System.in);
		String userName;
		String userChoice;
		String compChoice = "";
		int compWins = 0;
		int userWins = 0;

		// Greeting
		System.out.println("Welcome to Rock, Paper, Scissors!!");
		System.out.print("Please enter your name: ");
		userName = scan.next();
		System.out.println("Welcome " + userName + " GoodLuck!\nPlease pick \'R\'\'P\' or \'S\'");
		// get user choice and computer choice
		userChoice = scan.next();
		int randomNum = rGen.nextInt(3) + 1;

		switch (randomNum) {
		case 1:
			compChoice = "r";
			break;
		case 2:
			compChoice = "p";
			break;
		case 3:
			compChoice = "s";
			break;
		default:
			System.out.println("ERROR!");
		}

		
		////////////////////////////CHECK FOR WINNER/////////////////////////////////
		if (userChoice.equalsIgnoreCase("r") || userChoice.equalsIgnoreCase("rock")) {
			System.out.println("You picked rock");
			if(compChoice.equalsIgnoreCase("p") || compChoice.equalsIgnoreCase("paper")){
				System.out.println("computer picked paper");
				compWins++;
			} else if(compChoice.equalsIgnoreCase("s") || compChoice.equalsIgnoreCase("scissors")) {
				System.out.println("computer picked scissor");
				userWins++;
			} 
		}
		
		if (userChoice.equalsIgnoreCase("p") || userChoice.equalsIgnoreCase("paper")) {
			System.out.println("You picked paper");
			if(compChoice.equalsIgnoreCase("r") || compChoice.equalsIgnoreCase("rock")){
				System.out.println("computer picked rock");
				userWins++;
			} else if(compChoice.equalsIgnoreCase("s") || compChoice.equalsIgnoreCase("scissors")) {
				System.out.println("computer picked scissors");
				compWins++;
			} 
		}
		
		if (userChoice.equalsIgnoreCase("s") || userChoice.equalsIgnoreCase("scissors")) {
			System.out.println("You picked scissor");
			if(compChoice.equalsIgnoreCase("p") || compChoice.equalsIgnoreCase("paper")){
				userWins++;
			} else if(compChoice.equalsIgnoreCase("r") || compChoice.equalsIgnoreCase("rock")) {
				compWins++;
			} 
		}

		
		/////////////////////////////ADDING A POINT FOR THE WINNER/////////////////////
		if (userWins > compWins) {
			System.out.println(userName + " Wins!");
		} else if (userWins == compWins) {
			System.out.println(userName + " Tied!");
		} else if (userWins < compWins) {
			System.out.println(userName + " :(");
		}

		scan.close();

	}
}
