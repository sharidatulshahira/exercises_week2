/**
 * 
 */
package E92;

/**
 * @author SIsmail
 *
 */
public class MyDate {

	 	private int day;
	    private int month;
	    private int year;

	    public MyDate(int day, int month, int year) {
	        this.setDay(day);
	        this.setMonth(month);
	        this.setYear(year);
	    }

	    public String toString() {
	        return this.getDay() + "." + this.getMonth() + "." + this.getYear();
	    }

	    public boolean earlier(MyDate compared) {
	        // first we'll compare years
	        if ( this.getYear() < compared.getYear() ) {
	            return true;
	        }

	        // if the years are the same, we'll compare the months
	        if ( this.getYear() == compared.getYear() && this.getMonth() < compared.getMonth() ) {
	            return true;
	        }

	        // years and months the same, we'll compare the days
	        if ( this.getYear() == compared.getYear() && this.getMonth() == compared.getMonth() &&
	                this.getDay() < compared.getDay() ) {
	            return true;
	        }

	        return false;

		}
	    
	    public void advance(){
	    	setDay(getDay() + 1);
	    	if(getDay() > 30){
	    		setMonth(getMonth() + 1);
	    		setDay(1);
	    	
	    		 if(getMonth() > 12){
	    				setYear(getYear() + 1);
	    				setMonth(1);
	    		}
	    	}
	    
	    }
	    public void advance(int numberOfDays){
	    		for (int i = 0; i <numberOfDays; i++) {
	    			advance();	
				}	
	    }

		public MyDate afterNumberOfDays(int days) {
			MyDate newMyDate = new MyDate( this.getDay(), this.getMonth(), this.getYear());
			newMyDate.advance(days);
	        return newMyDate;
		}

		public int differenceInYears(MyDate comparedDate){
			int differenceYears = 0;
				if(this.getYear()>comparedDate.getYear()){
				differenceYears = (this.getYear() + (this.getMonth()/12) + (this.getDay()/365)) - 
									(comparedDate.getYear()+ (comparedDate.getMonth()/12) + (comparedDate.getDay()/365));
				
//				differenceYears = this.year - comparedDate.year;
				
			}
				else if (this.getYear()<comparedDate.getYear()){
					differenceYears =  (comparedDate.getYear()+ (comparedDate.getMonth()/12) + (comparedDate.getDay()/365)) - 
							(this.getYear() + (this.getMonth()/12) + (this.getDay()/365));
					
				}
			return differenceYears;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
		

}
