import java.util.Scanner;

/**
 * 
	Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
		1. Integers in each row are sorted from left to right.
		2. The first integer of each row is greater than the last integer of the previous row.
	
	Example:
		Input:
		matrix = [
		          [1,   3,  5,  7],
		          [10, 11, 16, 20],
		          [23, 30, 34, 50]
		         ]
		target = 3
		Output: true
		
	How fast can you go, and why?
 * 
 * */
public class Searching {
       
	public static void main(String[] args) {
		
        int [][] matrix = new int [30] [30];
		
		int rows = -1;
		int columns = -1;
		int number = -1;
		
        Scanner in = new Scanner (System.in);
		
		number = in.nextInt();///target number
        rows = in.nextInt();
		columns = in.nextInt(); //We define the rows and columns of the Matrix
		
		for(int i = 0;i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = in.nextInt();
		}
	   }
		
		int maxRow = 0;//the row to check if the number is in the matrix
		
		for(int i = rows -1; i>=0; i--) {
			
			if(matrix[i][columns - 1] > number) {
			 	maxRow = i;
			}else {
				break;
			}
		}
		
		boolean b = false;
		for(int i = 0;i < columns; i++) {
			if(matrix[maxRow][i]==number) {
				b = true;
				break;
			}
		}
		
		if(b==false) {
			System.out.print("No");
		}else {
			System.out.print("Yes");
		}
		
		in.close();
	}
}
