/**
 * EXERCISE 88.2: LIST OF STUDENTS
 * 
 */

/*
 	 Expected output:
 	 
  	name: Alan Turing
 	studentnumber: 017635727
 	name: Linus Torvalds
 	studentnumber: 011288989
 	name: Steve Jobs
 	studentnumber: 013672548
 	name:
 	Alan Turing (017635727)
 	Linus Torvalds (011288989)
 	Steve Jobs (013672548)

*/
package E88;


/**
 * @author SIsmail
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class E88_2 {

	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);

		
		while(true){
			System.out.print("name: ");
			String name = scan.nextLine();
			
			if (name.isEmpty()){
				break;
			}
			
			
			System.out.print("student number: ");
			String studentNumber=scan.nextLine();
			list.add(new Student(name,studentNumber));
		}
		
		for (Student student : list) {
	        System.out.println(student);
			
		}	
			
		}
		
			
}	
		
		

		
	
