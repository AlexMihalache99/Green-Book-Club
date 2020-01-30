import java.util.Arrays;

/**
 * Given a matrix consisting of 0s and 1s, we may choose any number of columns in the matrix and flip every cell in that column.
	Flipping a cell changes the value of that cell from 0 to 1 or from 1 to 0.
	Return the maximum number of rows that have all values equal after some number of flips.

	Example 1:
		Input: [[0,1],[1,1]]
		Output: 1
		Explanation: After flipping no values, 1 row has all values equal.

	Example 2:
		Input: [[0,1],[1,0]]
		Output: 2
		Explanation: After flipping values in the first column, both rows have equal values.

	Example 3:
		Input: [[0,0,0],[0,0,1],[1,1,0]]
		Output: 2
		Explanation: After flipping values in the first two columns, the last two rows have equal values.
 * */
public class Flips {
	
    public static int count(int [][] matrix) {
    	int  result = 0;
    	int rows = matrix.length;
    	int columns = matrix[0].length;
    	int [] flip = new int [columns];
    	
    	for(int i = 0; i < rows; i++) {
    		int count = 0;
    		for(int j = 0; j < columns; j++) {
    			flip[j] = 1 - matrix[i][j];
    		}
    		 for(int k = 0; k < rows; k++) {
    	       if(Arrays.equals(matrix[k], flip) || Arrays.equals(matrix[k], matrix[i])) {
    	    	   count++;
    	       }
    		}
    		 if(count > result) {
    			 result = count;
    		 }
    	}
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [][] matrix = {{0, 0, 0},
		                   {0, 0, 1},
		                   {1, 1, 0}};
	     	
	    System.out.print(count(matrix));
	}

}
