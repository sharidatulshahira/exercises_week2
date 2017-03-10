/**
 * 
 */
package E90;

/**
 * @author SIsmail
 *
 */
import java.util.ArrayList;
public class Team {
	private String name;
	private ArrayList<Player> listPlayer;
	private int maxSize = 16;

	public Team(String name){
		this.name= name;
		listPlayer = new ArrayList<Player>();
	}

	/**
	 * getName(), returns the player name
	 */
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = "barcelona";
//	}

	public int setMaxSize (int maxSize){
		this.maxSize = maxSize;
		return maxSize;
		
	}
	
	public int size(){
		return listPlayer.size() ;
		
	}
	
	/**
	 * addPlayer(), adds a player to the team
	 */
	public void addPlayer(Player playerName){
		 
			if(listPlayer.size()<maxSize){
			listPlayer.add(playerName);	
			}
		
	}
	
	/**
	 * goals(), returns the amount of goals
	 */
	public int goals(){
		int goals = 0;
		for (Player player : listPlayer) {
			goals+=player.getAmountOfGoals();
			
		}
		
		return goals;	
	}

	
		/**
		 * printPlayers(), prints the players in the team
		 */
		public void printPlayers() {
	        for (Player players : listPlayer) {
	            System.out.println(players );
	        }
	    }
		
	
	

	

}
