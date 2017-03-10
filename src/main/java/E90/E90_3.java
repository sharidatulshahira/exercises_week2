/**
 * EXERCISE 90.3: ADDING PLAYERS TO A TEAM
 */

/*
 * Expected output:
 		Brian, goals 0
		Pekka, goals 39
		Mikael, goals 1
 */
package E90;

/**
 * @author SIsmail
 *
 */
public class E90_3 {

	
	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian",0);
        Player pekka = new Player("Pekka", 39);

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        barcelona.printPlayers();
	}

}
