package com.Chapter15;

//Fig. 15.6: ReadTextFile.java
 // This program reads a text file and displays each record.
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private static Scanner input;

	
	public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
		

	}


	




// close file and terminate application
	public static void closeFile() {
		if (input != null)
			input.close();
		
	}// end of close file








	public static void readRecords() {
		
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
		
		try {
			while (input.hasNext()) {
				System.out.printf("%-10s%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			
			}
		}
		catch (NoSuchElementException elementException) {
			System.out.println(elementException);
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException)
		{
			System.err.println("Error reading from file. Terminating.");
		}
			
		}// end method readRecords
		
	








	public static void openFile() {
		try {
			input = new Scanner(Paths.get("c:/clients.txt"));
		}
		catch(IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
		
		
		
	

		
	}

}
