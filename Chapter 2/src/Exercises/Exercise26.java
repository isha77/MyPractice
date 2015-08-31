package Exercises;

import java.util.Scanner;

public class Exercise26 {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter a number: ");
		num2 = input.nextInt();
		
		if ( num1%num2 == 0)
			System.out.printf("%d is multiple of %d", num1,num2);
		
		if( num1%num2 != 0)
			System.out.printf("%d is not multiple of %d",num1,num2);
	}

}
