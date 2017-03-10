/**
 * EXERCISE 93.2: COMPARING AGES BASED ON BIRTHDATE
 */
package E93;
/*Expected output:
 	Martin is older than Pekka: false
	Pekka is older than Martin: true
  
*/

/**
 * @author SIsmail
 *
 */
public class E93_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person pekka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );

	}

}
