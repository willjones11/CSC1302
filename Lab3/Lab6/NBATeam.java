package Lab06;
import java.util.Random;
public class NBATeam {
public static void main(String[]args) {
	NBATeamA heat= new NBATeamA("heat",0,0);
	NBATeamA spurs= new NBATeamA("spurs",0,0);
	Random w= new Random();
	for(int i= 0; i<3; i++) {
		int n= w.nextInt();
		if(n>.5) {
		heat.winAgame(spurs);
	}
	else{
		heat.lossAgame(spurs);
		
	}
	}
	System.out.println(heat.toString());
	System.out.println(spurs.toString());
}
}
