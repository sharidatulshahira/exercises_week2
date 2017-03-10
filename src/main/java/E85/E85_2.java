/**
 * EXERCISE 85.2: FEEDING A PERSON
 * 
 * Expected output:
 * Brian weight: 7 kilo
 * Pekka weight: 85 kilos
 * Brian weight: 10 kilo
 * Pekka weight: 85 kilos
  
 * 
 * 
 */
package E85;

/**
 * @author SIsmail
 */
public class E85_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reformatory eastHelsinkiReformatory = new Reformatory();

	    Person brian = new Person("Brian", 1, 110, 7);
	    Person pekka = new Person("Pekka", 33, 176, 85);

	    System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
	    System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

	    eastHelsinkiReformatory.feed(brian);
	    eastHelsinkiReformatory.feed(brian);
	    eastHelsinkiReformatory.feed(brian);

	    System.out.println("");

	    System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
	    System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

	}

}
