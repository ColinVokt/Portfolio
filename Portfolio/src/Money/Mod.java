package Money;
import java.util.Scanner;
import static java.lang.System.out;
/*
 * Colin Vokt
 * 9/18
 */
public class Mod {

	public static void main(String[] args) {
		//Variables
		
		int quarters;
		int dimes;
		int nickels;
		int cent;
		int total;
		int whatsLeft;
		boolean greaterThan4;
		
		//Asking user for the amount
		
		Scanner  input = new Scanner(System.in);
		out.print("Whats in your wallet?");
		total = input.nextInt();
		
		//Taking the money and dividing
		
		quarters = total / 25;
		whatsLeft = total % 25;
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		cent = whatsLeft;
		
		//Tell the user the amount of each
		
		out.println("From "+total+ " cents you get");
		out.println("Quarters: "+quarters+ " Dimes: "+dimes+" Nickels: "+nickels+" cents; "+cent);
		greaterThan4 = quarters >=4;
		out.println(greaterThan4);
		
		
		
		
		
		
		
		
	}

}
