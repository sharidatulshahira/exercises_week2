/**
 * EXERCISE 93.1: CALCULATING THE AGE BASED ON THE BIRTHDAY
 */
package E93;
/*
 * Expected result:
    Thomas age 59 years
	Pekka age 21 years
 */
/**
 * @author SIsmail
 *
 */
public class E93_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");

	}

}
