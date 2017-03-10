/**
 * EXERCISE 86.3: PAYING WITH CARD
 * 
 * the change was 7.5
 * payment success: true
 * payment success: false
 * payment success: true
 * money in register 1002.5 economical lunches sold: 2 gourmet lunches sold: 1
 */
package E86;

/**
 * @author SIsmail
 */
public class E86_3 {

	
	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );

	}

}
