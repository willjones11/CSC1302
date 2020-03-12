/*
 * William Floyd Jones 
 * 2/21/20
 * HW3 Program 1 
 * this program is a minimal game of Tic Tac Toe in which intended to be two users, each one will take turns entering a space for 
 * which they like to put their symbol until they can connect 3 in a row before their opponent
 */

package HW3;
import java.util.*;
public class TicTacToe {
		public static void main(String[] args) {
		
			String[][] space = new String[3][3];
			for(int i= 0; i  < 3; i++) {
				for(int j = 0; j < 3; j++) {
					space[i][j] = "-";
				}
			}
			System.out.print("Welcome to play the Tic Tac Toe game! We have the following 3x3 board!\n");
			
			int moves = 0;
			int row;
			int column;
		while(!winner(space) && moves<9 ) {
			System.out.println(daBoard(space));
			Scanner console = new Scanner(System.in);
			System.out.print("Enter the row index: ");
			row = console.nextInt();
			System.out.print("Enter the column index: ");
			column = console.nextInt();
			while(space[row][column] != "-" ) {
				
				System.out.print("Enter the row index: ");
				row = console.nextInt();
				System.out.print("Enter the column index: ");
				column = console.nextInt();
			}
			
			if ( moves % 2 == 0) {
				space[row][column] = "X";
			}
			else {
				space[row][column] ="O";
			}
			
			moves++;
		}
		if( winner(space)) {
			System.out.println("We have a winner! Congrats!");
		}
		
		}
		public static boolean winner(String[][] space) {
			for(int i = 0; i < 3; i++) {
				if(space[i][0] == space [i][1] && space[i][1] == space[i][2] && space[i][0] != "-") {
					return true;
				}
				else if (space[0][i] == space[1][i] && space[1][i] == space[2][i] && space[0][i] != "-") {
					return true;
				}
				
			}
			if(space[0][0] == space[1][1] && space[1][1] == space[2][2] && space[0][0] != "-") {
				return true;
			}
			else if(space[0][2] == space[1][1] && space[1][1] == space[2][0] && space[2][0] != "-") {
				return true;
			}
			return false;
		}
		public static String daBoard(String[][] space) {
			String board ="";
			for(int i = 0; i < 3; i++) {
				board += "-------------\n" ;
				for(int j = 0; j < 3; j++) {
					board += "! " + space[i][j] + " ";
				}
				board += "!\n";
			}
			return board;
				
			
		}
}