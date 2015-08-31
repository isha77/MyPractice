//Exercise 2.16

package Exercises;

import java.util.Scanner;

public class Exercise16 {
	
	public static void main ( String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter First Number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		number2 = input.nextInt();
		
		
		if(number1 == number2)
			System.out.printf("%d == %d\n",number1,number2);
		
		if(number1 != number2)
			System.out.printf("%d != %d\n",number1,number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d\n",number1,number2);
		
		if(number1 > number2){
			System.out.printf("%d > %d\n",number1,number2);
		}
		
		}

}
