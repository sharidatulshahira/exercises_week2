/**
 * 
 */
package E93;

/**
 * @author SIsmail
 *
 */
import java.util.Calendar;

import E92.MyDate;

public class Person {

	private String name;
    private MyDate birthday;
    private int day;
    private int month;
    private int year;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.day = pp;
        this.month = kk;
        this.year=vv;
       
        
    }

    public int age() {
    	
		
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int day =  Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate birth = new MyDate(day,month,year);
        return birth.differenceInYears(birthday);
       
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
    
    public boolean olderThan(Person compared) {
    	// compare the ages based on birthdate  
//    	if(birthday.earlier(compared.birthday)){
//    		return true;
//    	}
//		return false;
    	
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
     * @param name
     * @param birthday
     */
    public Person (String name, MyDate birthday){
    	this.name=name;
    	this.birthday = birthday;
    }
    
    /**
     * @param name
     */
    public Person (String name){
    	this.name = name;
    	int day =  Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
    	this.birthday = new MyDate (day,month,year);
    }
}

