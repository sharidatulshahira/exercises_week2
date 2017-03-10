/**
 * EXERCISE 86.4: LOADING MONEY
 * 
 * Expected result:
 * money in register 1000.0 economical lunches sold: 0 gourmet lunches sold: 0
 * money on the card 2.0 euros
 * payment success: false
 * payment success: true
 * the card balance 98.0 euros
 * money in register 1100.0 economical lunches sold: 0 gourmet lunches sold: 1
 */
package E86;

/**
 * @author SIsmail
 */
public class E86_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );

	}

}
