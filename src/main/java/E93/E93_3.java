/**
 * EXERCISE 93.3: NEW CONSTRUCTORS
 */
package E93;

/*
 * Expected output:
 		Pekka, born 15.2.1983
		Steve, born 9.2.2012
 */
import E92.MyDate;

/**
 * @author SIsmail
 *
 */
public class E93_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );

	}

}
