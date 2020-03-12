package HW4;
import java.util.*;
public class NBA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ifAddPlayer;
		String playerName;
		System.out.println("Create the NBA team of Heats ....... ");
		NBATeam heat = new NBATeam("Heats");
		System.out.print("Add a play to Heats? (yes/no): ");
		ifAddPlayer= input.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	heat.addAPlayer(playerName);
			
	    		System.out.print("Add one more play to Heats? (yes/no): ");
			ifAddPlayer= input.next();
		}
		System.out.print("Create the NBA team of Spurs...... ");
		NBATeam spurs = new NBATeam("Spurs");
		System.out.print("Add a play to Spurs? (yes/no): ");
		ifAddPlayer = input.next();
		
		while(ifAddPlayer.equalsIgnoreCase("yes")) {
			System.out.print("What is the name to be added? ");;
			playerName = input.next();
			spurs.addAPlayer(playerName);
			System.out.print("Add one more play to Spurs? (yes/no): ");
			ifAddPlayer = input.next();
			
		}
		
		System.out.println("Game on now ...");
		while(heat.winNumber() < 4 || spurs.winNumber() < 4) {
			for(int i = 0; i < 7; i++) {
				double rand = Math.random();
				if( j > 0.5) {
					heat.winGame();
					spurs.loseGame();
				}else {
					heat.loseGame();
					spurs.winGame();
				
				}
			}
		}
			if(heat.winNumber() > spurs.winNumber()) {
				System.out.println(heat.teamName() + " ***WIN the series***");
			}else {
				System.out.println(spurs.winNumber() + " ***WIN the series***");
			}
		
		System.out.println(heat.toString());
		System.out.println(spurs.toString());
	}
	
		
	

}
