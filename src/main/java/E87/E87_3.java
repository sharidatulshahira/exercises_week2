/**
 * EXERCISE 87.3: MORE EXPENSIVE THAN
 * 
 * Expected output:
 * false
 * true
 * 
 */
package E87;

/**
 * @author SIsmail
 *
 */
public class E87_3 {

	
	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
		
		System.out.println( "Is it studio Manhattan more expensive than two rooms of Brooklyn? : ");
		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
		System.out.println();
		System.out.println( "Is it four And Kitchen Bronx more expensive than two rooms of Brooklyn? : ");
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
		  

	}

}
