import java.util.Scanner;

/**
 * 
 * Write an algorithm such that if an element is in an N by M matrix is zero, the entire row and column are set to zero.
 * Example:
		[
			[1,2,3,4]
			[1,0,8,7]
			[4,4,0,2]
			[6,7,8,9]
			[1,2,3,4]
		]
	
		Output:
		[
			[1,0,0,4]
			[0,0,0,0]
			[0,0,0,0]
			[6,0,0,9]
			[1,0,0,4]
		]
 * */
public class ZeroMatrix {

	public static void main(String[] args) {
		
		int [][] matrix = new int [30] [30];
		
		int rows = -1;
		int columns = -1;
		
		int [] allowedRow = new int [30];
		int [] allowedColumn = new int [30]; //We declare two(what will soon become) boolean arrays(containing 0 or 1)
		
		for(int i = 0;i<30;i++) {
			allowedRow[i]=allowedColumn[i] = 1; //We fill them with 1
		}
		
		Scanner in = new Scanner (System.in);
		
		rows = in.nextInt();
		columns = in.nextInt(); //We define the rows and columns of the Matrix
		
		for(int i = 0;i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = in.nextInt();
				
				if(matrix[i][j] == 0) {
					allowedRow[i] =  0;
					allowedColumn[j] = 0;
				}
			}
		}
		
		for(int i = 0;i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				
			 System.out.print(matrix[i][j] * allowedRow[i] *allowedColumn[j] +" " );
			}
			System.out.println();
	    }
		in.close();

}
	}
