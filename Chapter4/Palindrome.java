/**
 * 
 */
package Chapter4;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int remainder;
		int reverseInput = 0;
		int originalInput = number;
		
		if(originalInput >= 10000 && originalInput <= 100000) {
			while(originalInput !=0) {
				remainder = originalInput % 10;
				reverseInput = reverseInput * 10 + remainder;
				//System.out.println(reverseInput);
				originalInput = originalInput/10;
			}	
		
		if(number == reverseInput) {
				System.out.println("The number is a palindrome");
			}
		else {
				System.out.println("The number is not a palindrome");
			}
			
		}
		
		
		
		
		
		
		

	}

}
