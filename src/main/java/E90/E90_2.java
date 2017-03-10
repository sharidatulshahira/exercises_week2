/**
 * EXERCISE 90.2: PLAYER
 */

/*
 * Expected output:
 		Team: FC Barcelona
		Player: Brian, goals 0
		Player: Pekka, goals 39
 */
package E90;

/**
 * @author SIsmail
 *
 */
public class E90_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");
	    System.out.println("Team: " + barcelona.getName());

	        Player brian = new Player("Brian", 0);
	        System.out.println("Player: " + brian);

	        Player pekka = new Player("Pekka", 39);
	        System.out.println("Player: " + pekka);

	}

}
