package Chapter2;
import java.util.Scanner;

public class Diameter_Circumference_Area {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input radius: ");
		int radius = input.nextInt();
		
		System.out.printf("The Diameter of the Circle is %d: ", 2*radius); // output the diameter of the circle
		System.out.println();
		System.out.println();
		System.out.printf("The Circumfrence of the Circle is %f: ", 2*Math.PI*radius);
		System.out.println();
		System.out.println();
		System.out.printf("The Area of the Circle is %f: ", Math.PI * Math.pow(radius, 2));
	
		

	}//end of main method

}// end of main class
