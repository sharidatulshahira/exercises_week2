/**
 * EXERCISE 86.1: THE "STUPID" LYYRA CARD
 * 
 * Expected output:
 * money on the card 10.0
 * money taken: true
 * money on the card 2.0
 * money taken: false
 * money on the card 2.0
 * 
 */
package E86;

/**
 * @author SIsmail
 */
public class E86_1 {

	
	public static void main(String[] args) {
		LyyraCard cardOfPekka = new LyyraCard(10);
		
		        System.out.println("money on the card " + cardOfPekka.balance() );
		        boolean succeeded = cardOfPekka.pay(8);
		        System.out.println("money taken: " + succeeded );
		        System.out.println("money on the card " + cardOfPekka.balance() );
		
		        succeeded = cardOfPekka.pay(4);
		        System.out.println("money taken: " + succeeded );
		        System.out.println("money on the card " + cardOfPekka.balance() );
	}

}
