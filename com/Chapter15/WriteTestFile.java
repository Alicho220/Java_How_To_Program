package com.Chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Person implements Serializable {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	


}

//import java.io.IOException;
 
public class WriteTestFile {

	public static void main(String[] args) { 
		Person mike = new Person("Mike Lover");
//		try {
//			writeToFile(mike);
//		} catch (IOException e) {
//			
//			System.out.println(e.getMessage() );
//		}
		try {
			readFile();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public static void writeToFile(Person p) throws IOException{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
		
		objectOutputStream.writeObject(p);
	}
	
	
	public static void readFile() throws IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.bin"));
		
		Person name =(Person) objectInputStream.readObject();
		System.out.println(name);
//		objectInputStream.writeObject(p);
	}
	

}
