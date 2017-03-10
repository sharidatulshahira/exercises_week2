/**
 * EXERCISE 90.4: THE TEAM MAXIMUM SIZE AND CURRENT SIZE
 */
/*
 * Expected output:
 		Number of players: 1
  
 */
package E90;

/**
 * @author SIsmail
 *
 */
public class E90_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(1);

        Player brian = new Player("Brian", 0);
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Number of players: " + barcelona.size());

	}

}
