package Chapter2;

public class HighestNumber {

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 8;
		int number3 = 6;
		int number4 = 10;
		int number5 = 15;
		int smallestNumber=0;
		
		
		if (number1 > smallestNumber) 
			smallestNumber = number1;
			//System.out.printf("The Smallest Number is %d:", number1);
		
		if(number2 < number1) 
			smallestNumber = number2;
			//System.out.printf("The Smallest Number is %d:", number3);
		
		
		if(number3 < number2) 
			smallestNumber = number3; 
			//System.out.printf("The Smallest Number is %d:", number4);
		
		if(number4 < number3) 
			smallestNumber = number4; 
		
		
		if(number5 < number4) 
			smallestNumber = number5; 
			System.out.printf("The Smallest Number is %d:", smallestNumber );
		
		

	}

}
