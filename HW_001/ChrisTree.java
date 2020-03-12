
import java.util.*;
public class ChrisTree {
	 public static void main ( String[] args) {
	     Scanner console = new Scanner(System.in);
	     System.out.print("How many segments do you want your tree to have? ");
	     int segments = console.nextInt();
	     System.out.print("What height do you want each segment to be? ");
	     int height = console.nextInt();
	 /*   
	 }
	   public static void Tree_builder( int segments, int height) {
	 */  
		   for (int x = 0; x < segments; x++) {
			   for ( int i = 0; i <= height; i++) {
				   for ( int y= 0; y < (height - 1); y++) {
					   System.out.print(" ");
				   
				       for ( int j = 0; 3 < (height - j); j++) {
				   			System.out.print("*");
				   			
				   		}
				       System.out.println();
	           
				   }
			   }   
	        
	       }   
	 }
}