package Lab06;
import java.util.*;
public class NBATeamA {
	private int NumberOfWins;
	private int NumberOfLoss;
	private String teamName;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName= teamName;
	}
	public int getNumberOfWins() {
		return NumberOfWins;
	}
	public void setNumberOfWins(int numberOfWins) {
		NumberOfWins = numberOfWins;
	}
	public int getNumberOfLoss() {
		return NumberOfLoss;
	}
	public void setNumberOfLoss(int numberOfLoss) {
		NumberOfLoss= numberOfLoss;
	}
	
	public NBATeamA(String s, int w, int l) {
		this.teamName= s;
		NumberOfWins=w;
		NumberOfLoss = l;
	}
	public void winAgame(NBATeamA b) {
		++NumberOfWins;
		b.NumberOfWins++;
		
	}
	public void lossAgame(NBATeamA b) {
		++NumberOfLoss;
		b.NumberOfWins++;
	}
	public String toString() {
		return "NBATeam (teamName="+ teamName+", NumberOfWins"+NumberOfWins+ ", NumberOfLoss="+ NumberOfLoss+ ")";
	}
	
	}

