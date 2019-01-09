package GuessMyNumberGame;

import java.util.Scanner;

public class GuessMyNumberGame {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int attempts = 0;
		
		System.out.println("Welcome! You must guess the number im thinking, Good Luck!");
		
			
		
		int num1 = (int)(Math.random() * 100);
		
		System.out.println("Enter a number between 1 and 100");
		
		int guess = input.nextInt();
		
		while (guess != num1) {
			attempts++;
			
			if (guess > num1) {
				System.out.println("Guess lower!");
			}
			
			else {
				System.out.println("Guess Higher!");
			}
			if (attempts == 10) {
				
			}
			guess = input.nextInt();
		}
		
			System.out.println("Congrats you guess the right number! the number was " + num1 + 
					" and you guessed " + attempts + " times.");
			
			
			int num2 = (int)(Math.random() * 100);
			System.out.println("Enter a number between 1 and 100");
			int guess2 = input.nextInt();
			do { 
				if (guess2 > num2) {
				System.out.println("Guess lower!");
			}
			else {
				System.out.println("Guess Higher!");
			}
			
			
			guess2 = input.nextInt();
			
			} while(guess2 != num2); 
		
			System.out.println("Congrats you guess the right number! the number was " + num2);
			
		
			int num3 = (int)(Math.random() * 100);
			System.out.println("Enter a number between 1 and 100");
			for (int guess3 = 0; guess3 != num3; guess3 = input.nextInt()) {
				if (guess3 > num3) {
					System.out.println("Guess lower!");
				}
				else {
					System.out.println("Guess Higher!");
				}
			}
			
			System.out.println("Congrats you guess the right number! the number was " + num3);
			

	}

}
