/**
 * 
 */
package E88;

/**
 * @author SIsmail
 *
 */
public class Student {
	private String name;
	private String studentNumber;
	
	public Student(String name, String studentNumber){
		this.name = name;
		this.studentNumber = studentNumber;
		
	}
	/**
	 * method getName() returns the student name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method getStudentNumber() returns the student number
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String toString(){
		return name + " " + "(" + studentNumber + ")";
		
	}
	
	
	


}
