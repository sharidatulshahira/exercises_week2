/**
 * EXERCISE 87.1: LARGER

 * 
 * Expected output:
 * false
 * true
 */
package E87;

/**
 * @author SIsmail
 *
 */
public class E87_1 {

	
	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
		
		System.out.println( "Is it studio Manhattan larger than two rooms of Brooklyn? : ");
		System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
		System.out.println();
		System.out.println( "Is it four And Kitchen Bronx larger than two rooms of Brooklyn? : ");
		System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true

	}

}
