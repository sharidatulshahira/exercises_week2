/**
 * 
 */
package E85;

/**
 * @author SIsmail
 *
 */
public class Reformatory {
	private int totalWeightsMeasured = 0;

	/**
	 * @param person
	 * @return the weight of the parameter.
	 */
	public int weight(Person person){
		this.totalWeightsMeasured++;
		return person.getWeight();
	}
	
	/**
	 * @param person
	 * increases the weight of its parameter by one.
	 * @return
	 */
	public int feed(Person person){
		int increase = person.getWeight();
		increase++;
		person.setWeight(increase);
		return increase;
		
	}
	
	
	/**
	 * @return the total number of times a weight has been measured.
	 */
	public int totalWeightsMeasured(){
		return totalWeightsMeasured;
		
	}
	
	
		
		
	

	

}
