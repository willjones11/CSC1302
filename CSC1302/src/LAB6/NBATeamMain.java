package LAB6;
import java.util.*;
public class NBATeamMain {
	public static void main(String[] args) {
		NBATeam1 heat = new NBATeam1 ("heat", 0, 0);
		NBATeam1 spurs = new NBATeam1 ("spur", 0, 0);
		Random w = new Random();
			for (int i = 0; i < 3; i++ ) {
				int n = w.nextInt();
				if (n>0.5) {
					heat.winAgame(spurs);
				}
				else {
					heat.lossAgame(spurs);
				}
		System.out.println(heat.toString());
		System.out.println(spurs.toString());
	}
	
	}
}
