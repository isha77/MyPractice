//Fig. 2.15 : Comparison.java
//Compare integers using if statements, relational operator and equality operators.

package Example;

import java.util.Scanner;

public class Comparision {

	public static void main(String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter First integer:");
		number1 = input.nextInt();
		
		System.out.print("Enter Second integer:");
		number2 = input.nextInt();
		
		if( number1 == number2)
			
			System.out.printf("%d == %d\n",number1,number2);
		
		if( number1 != number2)
			
		    System.out.printf("%d != %d\n",number1,number2);
		
		if( number1 < number2 )
			
			System.out.printf(" %d < %d\n",number1,number2);
		
		if( number1 > number2)
			
			System.out.printf(" %d > %d\n",number1,number2);
		
		if( number1 <= number2)
			
			System.out.printf("%d >= %d\n",number1,number2);
	}
}
