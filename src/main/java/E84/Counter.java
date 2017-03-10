/**
 * 
 */
package E84;

/**
 * @author SIsmail
 *
 */
public class Counter {
	private int startingValue;
	private boolean check;
	
	
	
	public Counter (int startingValue, boolean check){
		this.startingValue = startingValue;
		this.check = check;	
	}
	
	public Counter (int startingValue){
		this(startingValue,false);
	}
	
	public Counter (boolean check){
		this(0, check);
	}
	
	public Counter(){
		this(0,false);
	}
	
	/**
	 * return the current value of the counter
	 */
	public int value(){
		return startingValue;
		
	}
	
	/**
	 * increase the value of the counter by one.
	 */
	public void increase(){
		if(startingValue>=0){
			check = true;
			startingValue++;
		}
	}
	
	/**
	 * decrease the value of the counter by one
	 * but not below 0.
	 */
	public void decrease(){
		if (startingValue >= 0){
			check = true;
			startingValue--;
		}
		
		else if (startingValue < 0){
			check = false;
			value();
		}
	}
	
	/**
	 * @param increaseAmount
	 * increase the value by the amount of the parameter.
	 * if the value in parameter is negative, the value will not change.
	 */
	public void increase(int increaseAmount){
		if (increaseAmount >= 0){
			startingValue+= increaseAmount;
		}
		
	}
	
	/**
	 * @param decreaseAmount
	 * decreases the value of the counter by the amount given by the parameter, 
	 * but not below 0 if the check is on.
	 * If the value of the parameter is negative, the value of the counter will not change.
	 */
	public void decrease (int decreaseAmount){
		if(decreaseAmount >= 0){
			check = true;
			startingValue-= decreaseAmount;
		}
		else if(decreaseAmount == 0){
			check = true;
			startingValue-= decreaseAmount;
			
		}
		else if(decreaseAmount < 0){
			value();
		}
	}
	
	
}
