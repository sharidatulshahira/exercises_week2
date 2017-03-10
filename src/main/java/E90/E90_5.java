/**
 * EXERCISE 90.5: GOALS OF A TEAM
 */

/*
 * Expected output:
 		Total goals: 40
 */
package E90;

/**
 * @author SIsmail
 *
 */
public class E90_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian",0);
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());

	}

}
