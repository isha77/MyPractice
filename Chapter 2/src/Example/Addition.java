//Fig. 2.7 : Addition.java
//Addition program that displays the sum of two numbers.

package Example;

import java.util.Scanner;

public class Addition {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d", sum);
	}

}
