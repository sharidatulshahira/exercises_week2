/**
 * EXERCISE 86.2: CASH REGISTER AND PAYING WITH CASH
 * 
 * Expected result:
 * the change was 7.5
 * the change was 2.5
 * the change was 0.0
 * money in register 1009.0 economical lunches sold: 2 gourmet lunches sold: 1
 */
package E86;

/**
 * @author SIsmail
 */
public class E86_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println( unicafeExactum );

	}

}
