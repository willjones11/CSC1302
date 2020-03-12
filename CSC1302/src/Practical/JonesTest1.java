package Practical;
import java.util.*;
public class JonesTest1 {
	public static void main(String[] args) {
		int row = 7;
		Scanner console = new Scanner(System.in);
		System.out.print("Input the Column Size: ");
		int column = console.nextInt();
		double[][] m = new double[row][column];
		Random rand = new Random();
		for(int i = 0; i < row ; i++) {
			for(int j = 0; j < column; j++) {
				
				m[i][j] = 4.0 + (14.0 - 4.0) * rand.nextDouble()  ;
				
			}
			
		}
		double[][] m2 = {{1,1,1}, {3,4,7}, {1,4,1}};
		System.out.println("the Max column sum for m is: " + MaxCol(m, row, column));
		
		System.out.println("the Max column sum for m2 is: " + MaxCol1(m2, 3, 3));
		System.out.println("the average of array m is: " + returnAvg3(m, column));
		System.out.println("the average of array m2 is: " + returnAvg3(m2, 3));
	}
	public static double MaxCol(double[][] array, int row, int column) {
		double[] max1 = new double[column];
		double max = 0;
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				
				max1[i] = max1[i] + array[j][i];
					
			}
			if(max1[i] > max) {
				max = max1[i];
			}
		}
	return max;	
	}
	
	
	public static double MaxCol1(double[][] array, int row, int column) {
		double[] max1 = new double[column];
		double max = 0;
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				
				max1[i] = max1[i] + array[j][i];
					
			}
			if(max1[i] > max) {
				max = max1[i];
			}
		}
	return max;	
	}

	public static double returnAvg3(double[][] array,int column) {
		double sum = 0;
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j <column; j++) {
				sum = sum + array[i][j];
			}
		}
		double avg = sum / 3;
		return avg;
	}
}