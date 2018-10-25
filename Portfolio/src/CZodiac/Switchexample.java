package CZodiac;

import java.util.Scanner;

/*
 * Colin Vokt
 * 10/18
 */
public class Switchexample {

	public static void main(String[] args) {
		/*
		 * switch (switch expression) {
		 * case value1:
		 * Statements;
		 * break;
		 * case value 2:
		 * Statements;
		 * break;
		 * case value3
		 * Statements;
		 * break;
		 * default:
		 * Statements;
		 * break;
		 * }
		 * }
		*/

		
		//Ask for the year they were born in
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year you were born: ");
		int year = input.nextInt();
		
		//Make switch statement and tell them there Zodiac and fun fact
		
		switch (year % 12) {
		case 0:
			System.out.println("Monkey");
			System.out.println("Sharp and Smart");
			break;
		case 1:
			System.out.println("Rooster");
			System.out.println("Observant and Hardworking");
			break;
		case 2:
			System.out.println("Dog");
			System.out.println("Loyal and Honest");
			break;
		case 3:
			System.out.println("Pig");
			System.out.println("Compassionte and Generous");
			break;
		case 4:
			System.out.println("Rat");
			System.out.println("Quick and Resourceful");
			break;
		case 5:
			System.out.println("Ox");
			System.out.println("Diligent and Dependable");
			break;
		case 6:
			System.out.println("Tiger");
			System.out.println("Brave and Confident");
			break;
		case 7:
			System.out.println("Rabbit");
			System.out.println("Quiet and Elegant");
			break;
		case 8:
			System.out.println("Dragon");
			System.out.println("Confident and Intelligent");
			break;
		case 9:
			System.out.println("Snake");
			System.out.println("Intelligent and Wise ");
			break;
		case 10:
			System.out.println("Horse");
			System.out.println("Active and Energetic");
			break;
		case 11:
			System.out.println("Goat");
			System.out.println("Calm and Gentle");
			break;
		}

	
		
		
		
	}

}
