/**
 * EXERCISE 87.2: PRICE DIFFERENCE
 * 
 * Expected output:
 * 71600
 * 35400
 */
package E87;

/**
 * @author SIsmail
 *
 */
public class E87_2 {

	
	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
		
		System.out.println("Price Difference between studio Manhattan and two rooms of Brooklyn: "  + studioManhattan.priceDifference(twoRoomsBrooklyn)); // 71600	   
		System.out.println( "Price Difference between four And Kitchen Bronx and two rooms of Brooklyn: " + fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
	}

}
