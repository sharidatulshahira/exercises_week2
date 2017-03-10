/**
 * 
 */
package E90;

/**
 * @author SIsmail
 *
 */
public class Player {
	private String playerName;
	private int amountOfGoals;
	
	public Player (String playerName, int amountOfGoals){
		this.playerName = playerName;
		this.amountOfGoals = amountOfGoals;
		
	}
	
	/**
	 * getPlayerName(), returns the player name
	 */
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		playerName = "brian";
		playerName = "pekka";
	}
	/**
	 * getAmountOfGoals(), returns the amount of goals
	 */
	public int getAmountOfGoals() {
		return amountOfGoals;
	}
	public void setAmountOfGoals(int amountOfGoals) {
		this.amountOfGoals = amountOfGoals;
	}
	
	public String toString(){
		return playerName + " " + amountOfGoals;
		
	}
	

	
	

}
