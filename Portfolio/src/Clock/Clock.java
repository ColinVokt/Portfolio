package Clock;


import java.util.Scanner;
/*
 * Colin Vokt
 * 9/18
 * 
 */

public class Clock {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		//Get a the current time in milliseconds
		
		long totalMilliseconds = System.currentTimeMillis();
		
		//Take that and put it in seconds,minutes , and hours
		
		long totalSeconds = totalMilliseconds/1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds/60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes/60;
		long currentHours = totalHours % 24;
		currentHours = currentHours - 6;
	
		//Print the time
		
		System.out.println("The current time is " + currentHours + " Hours : " + currentMinutes + " Mins : " + currentSecond + " Sec : ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
