package Chapter4;

import java.util.Scanner;

public class Sentinel_Control_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int gradeCounter = 0;
		int total = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();

		while(grade != -1) {
			total += grade;
			gradeCounter++;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
			
		}// end of while loop
		
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			System.out.printf("%nTotal of the %d grades entered is %d%n",gradeCounter, total);
			
			System.out.printf("Class average is %.2f%n", average);
		}//end of if
		else // no grades were entered, so output appropriate message
			 System.out.println("No grades were entered");

	}

}
