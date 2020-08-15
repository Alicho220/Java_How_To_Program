package Chapter4;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1= new Student("Hammer ", 70.50);
		Student student2= new Student("Stephen", 40.00);
		Student student3= new Student("kate",90.55);

		
		System.out.printf("%s\n", student1.getLetterGrade());
		System.out.print("%s%d");
	}

	private static void print(String string, Student student1) {
		// TODO Auto-generated method stub
		
	}

}
