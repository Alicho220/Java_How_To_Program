package Chapter2;
import java.util.Scanner;

public class Arithmetics {

	public static void main(String[] args) {
		
		int largestNumber=0;
		int smallestNumber=0;
		int sum = 0;
		int average;
		int product;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter secound number: ");
		int number2 = input.nextInt();
		
		System.out.println("Enter third number: ");
		int number3 = input.nextInt();
		
		if(number1 > largestNumber)
			largestNumber =number1;
		
		if(number2 > number1)
			largestNumber = number2;
		
		if(number3 > number2)
			largestNumber = number3;
		
		
		System.out.printf("The Largest Number is :%d\n",largestNumber);
		System.out.println();
		
			
			
		
		sum = number1 + number2 + number3;
		average = sum / 3;
		product = number1 * number2 * number3; 
		
		System.out.printf("The sum of numbers is :%d\n",sum);
		System.out.println();
		System.out.printf("The average of numbers is :%d\n",average);
		System.out.println();
		System.out.printf("The product of numbers is :%d\n",product);
		
		

	}

}
