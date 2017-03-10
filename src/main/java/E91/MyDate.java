/**
 * 
 */
package E91;

/**
 * @author SIsmail
 *
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;

	}
    
    /**
     * advance(), advances the date by one
     */
    public void advance(){
    	day++;
    	if(day > 30){
    		month++;
    		day = 1;
    	
    		 if(month > 12){
    				year++;
    				month = 1;
    		}
    	}
    
    }
    /**
     * advance(int numberOfDays), advance the day by the number given as parameter
     */
    public void advance(int numberOfDays){
    		for (int i = 0; i <numberOfDays; i++) {
    			advance();	
			}
    }

	/**
	 * afterNumberOfDays(int days), returns a new MyDate-object that has the date which equals the date of the object for which the method was called advance by the parameter of the method days.
	 */
	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate( this.day, this.month, this.year);
		newMyDate.advance(days);
        return newMyDate;
	}

}
