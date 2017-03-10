/**
 * EXERCISE 88.3: SEARCH
 */

/* Expected output:
				name: Carl Gustaf Mannerheim
				studentnumber: 015696234
				name: Steve Jobs
				studentnumber: 013672548
				name: Edsger Dijkstra
				studentnumber: 014662803
				name:

				Carl Gustaf Mannerheim (015696234)
				Steve Jobs (013672548)
				Edsger Dijkstra (014662803)

				Give search term: st
				Result:
				Carl Gustaf Mannerheim (015696234)
				Edsger Dijkstra (014662803)
 
 */
package E88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
public class E88_3 {

	
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
		
		System.out.print("Give search term: ");
		String searchterm = scan.nextLine();
		System.out.println("Result: ");
		
		for(int i=0; i<list.size(); i++){
			Student searchName = list.get(i);
			String search = searchName.getName();
			if (search.contains(searchterm)){
				System.out.println(searchName);
			}
			
			
		}

	}

}
