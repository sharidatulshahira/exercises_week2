/**
 * 
 */
package E89;

/**
 * @author SIsmail
 *
 */
public class Clock  {
	
	private BoundedCounter hours;
	private BoundedCounter minutes;
	private BoundedCounter seconds;
	
	public BoundedCounter getHours() {
		return hours;
	}

	public void setHours(BoundedCounter hours) {
		this.hours = hours;
	}

	public BoundedCounter getMinutes() {
		return minutes;
	}

	public void setMinutes(BoundedCounter minutes) {
		this.minutes = minutes;
	}

	public BoundedCounter getSeconds() {
		return seconds;
	}

	public void setSeconds(BoundedCounter seconds) {
		this.seconds = seconds;
	}

	
	
	 public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
		 	hours = new BoundedCounter(23);
	        minutes = new BoundedCounter(59);
	        seconds = new BoundedCounter(59);

	        hours.setValue(hoursAtBeginning);
	        minutes.setValue(minutesAtBeginning);
	        seconds.setValue(secondsAtBeginning);
	      
		  // the counters that represent hours, minutes and seconds are created and
	      // set to have the correct initial values
	    }

	    public void tick(){
	    		seconds.next();
	    		seconds.getValue();
        		if (seconds.getValue() == 0){
        			minutes.getValue();
        			minutes.next();
        			if(minutes.getValue()==0){
        				hours.getValue();
        				hours.next();
        		}
        	}
	      // Clock advances by one second
	    }

	    public String toString() {
			return hours + ":" + minutes + ":" + seconds;
			
	        // returns the string representation
			
	
	
		

	    }

}
