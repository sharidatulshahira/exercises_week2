/**
 * EXERCISE 84: OVERLOADED COUNTER
*/
package E84;

/**
 * @author SIsmail
 *
 */
public class Main {

	
	public static void main(String[] args) {
		Counter count = new Counter (9,true);
		Counter countDec = new Counter (-1,false);
		
		
		
		count.increase();
		System.out.println(count.value());
		
		count.increase(3);
		System.out.println(count.value());
		
		count.decrease();
		System.out.println(count.value());
		
		count.decrease(-1);
		System.out.println(count.value());
		
		System.out.println();
		
		countDec.increase();
		System.out.println(countDec.value());
		
		countDec.increase(-3);
		System.out.println(countDec.value());
		
		countDec.decrease();
		System.out.println(countDec.value());
		
		countDec.decrease(-1);
		System.out.println(countDec.value());

	}

}
