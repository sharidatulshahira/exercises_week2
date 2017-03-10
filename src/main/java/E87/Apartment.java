/**
 * 
 */
package E87;

/**
 * @author SIsmail
 *
 */
public class Apartment {

	private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
	}
    
    
    /**
     * @param otherApartment
     * method public boolean larger(Apartment otherApartment) returns true if the Apartment object for which 
     * the method is called (this) is larger 
     * than the apartment object given as parameter (otherApartment).
     * @return
     */
    public boolean larger(Apartment otherApartment){
    	if(this.squareMeters>otherApartment.squareMeters){
    		return true;
    		
    	}
		return false;
    }
    
    /**
     * @param otherApartment
     * method public int priceDifference(Apartment otherApartment) returns the absolute value of the price difference of the Apartment object for which the method is called (this) 
     * and the apartment object given as parameter (otherApartment). 
     * The price of an apartment is squareMeters * pricePerSquareMeter.
     * 
     * @return
     */
    public int priceDifference(Apartment otherApartment){
    	int price = Math.abs((this.squareMeters * this.pricePerSquareMeter) - (otherApartment.squareMeters* otherApartment.pricePerSquareMeter));
		return price;
    	
    }
    
    /**
     * @param otherApartment
     * method public boolean moreExpensiveThan(Apartment otherApartment) returns true if the Apartment-object for which the method is called (this) has a higher price than the apartment object given as parameter (otherApartment).
     * @return
     */
    public boolean moreExpensiveThan(Apartment otherApartment){
    	if ((this.squareMeters * this.pricePerSquareMeter)>(otherApartment.squareMeters* otherApartment.pricePerSquareMeter)){
		return true;
    }
    	else{
    	return false;
    }
    	
    }
    
    

}
