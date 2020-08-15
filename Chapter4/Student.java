package Chapter4;

public class Student {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	private String studentName;
	private double studentAverage;
	/**
	 * @param studentName
	 * @param studentAverage
	 */
	public Student(String studentName, double studentAverage) {
		this.studentName = studentName;
		this.studentAverage = studentAverage;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentAverage
	 */
	public double getStudentAverage() {
		return studentAverage;
	}
	/**
	 * @param studentAverage the studentAverage to set
	 */
	public void setStudentAverage(double studentAverage) {
		if(studentAverage > 0 && studentAverage <= 100)
			this.studentAverage = studentAverage;
		//this.studentAverage = studentAverage;
	}
	
	public String getLetterGrade() {
		
		String letterGrade = "";
		
		if (studentAverage >= 90.0) 
			letterGrade = "A";
		else if (studentAverage >= 80.0) 
				letterGrade = "B";
		else if (studentAverage >= 70.0) 
			letterGrade = "C";
		else if (studentAverage >= 60.0) 
			letterGrade = "D";
		else
			letterGrade = "A";
		return letterGrade;
	}
	
	//}
	
	

}
