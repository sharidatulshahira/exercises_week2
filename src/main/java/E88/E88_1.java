/**
 * EXERCISE 88.1: CLASS STUDENT
 * 
 * Expected output:
 * name: Pekka Mikkola
 * studentnumber: 013141590
 * Pekka Mikkola (013141590)
 */
package E88;

/**
 * @author SIsmail
 *
 */
public class E88_1 {

	
	public static void main(String[] args) {
		Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

	}

}
