package Grades;

import java.util.Scanner;

/*
 * Colin Vokt
 * 10/18
 */
public class Grades {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		//Make variables
		
		double one;
		double two;
		double three;
		double four;
		double five;
		double six;
		double seven;
		double eight;
		double nine;
		double ten;
		int sum;
		int avg;
		String grade;
		
		//Ask User for grades
		
		System.out.println(" Please Enter 10 grades from 0-100 nothing else above or below >:(");
		one = input.nextDouble();
		two = input.nextDouble();
		three = input.nextDouble();
		four = input.nextDouble();
		five = input.nextDouble();
		six = input.nextDouble();
		seven = input.nextDouble();
		eight = input.nextDouble();
		nine = input.nextDouble();
		ten = input.nextDouble();
		
		// Makes equation
		
		sum = (int) (one + two + three + four + five + six + seven + eight + nine + ten);
		avg = sum/10;
		
		//Makes if/else statements
		
		if (avg > 90) {
			grade = "A";
		}
		else if (avg > 80) {
			grade = "B";
		}
		else if (avg > 70) {
			grade = "C";
	}
		else if (avg > 60) {
			grade = "D";
		}
		else if (avg > 50) {
			grade = "F";
		}
		else {
			grade ="F";
		}
		
		//Make output statement
		
		System.out.println("The Average of your grade is " + avg + " and your letter grade is " + grade);
		
		
		
		
		
}
	

}
