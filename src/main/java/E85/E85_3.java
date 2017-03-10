/**
 * EXERCISE 85.3: NUMBER OF TIMES A WEIGHT HAS BEEN MEASURED
 * 
 * Expected output:
 * total weights measured 0
 * weights measured 2
 * weights measured 6
 * 
 */
package E85;

/**
 * @author SIsmail
 */
public class E85_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Reformatory eastHelsinkiReformatory = new Reformatory();

		    Person brian = new Person("Brian", 1, 110, 7);
		    Person pekka = new Person("Pekka", 33, 176, 85);

		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

		    eastHelsinkiReformatory.weight(brian);
		    eastHelsinkiReformatory.weight(pekka);

		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

		    eastHelsinkiReformatory.weight(brian);
		    eastHelsinkiReformatory.weight(brian);
		    eastHelsinkiReformatory.weight(brian);
		    eastHelsinkiReformatory.weight(brian);

		    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

	}

}
