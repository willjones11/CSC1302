package HW4;

public class NBATeam {
	private String sTeamName;
	private int nWin;
	private int nLoss;
	private String [] playerArray = new String[1];
	private String [] temp = new String[1];
	private int count = 0;
	public NBATeam(String name) {
		this.sTeamName = name;
	}
	
	public String teamName() {
		return sTeamName;
		
	}
	
	public void addAPlayer(String playerName) {
		count++;
		if(count == 1) {
			playerArray [count - 1] = playerName;
			for(int i = 0; i < playerArray.length; i++) {
				temp[i] = playerArray[i];
				
			}
		}else {
			playerArray = new String[count];
			for(int i = 0; i < playerArray.length; i++) {
				playerArray[i] = temp[i];
				
			}
			playerArray[count -1] = playerName;
			temp = new String[count];
			for(int i = 0; i < playerArray.length; i++) {
				temp[i] = playerArray[i];
				
			}
		}
	public void winGame() {
		nWin++;
	}
	public int winNumber() {
		return nWin;
	}
	public void loseGame() {
		nLoss++;
	}
	public String toString() {
		return sTeamName + " " + Arrays.toString(temp) + "win: " + nWin + " Lose: " + nLoss;
	}
}
