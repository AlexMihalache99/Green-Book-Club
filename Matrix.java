/*
 * Given a 2D matrix filled with 0's and 1's, find the largest square containing only 1's and return its area

	Example: [1,0,1,0,0]
             [1,0,1,1,1]
             [1,1,1,1,1]
             [1,0,0,1,0]


            Output:4
 * 
 * 
 * */
public class Matrix {

	public static void main(String[] args)  {
		
		int matrix[][] = {{1,0,1,0,0},
	                      {1,0,1,1,1},
	                      {1,1,1,1,1},
	                      {1,0,0,1,0},
				          };
		
		int row =  matrix.length;
		int column =  matrix[0].length;
		
		int maxSolution = -1;
		int maxColumn = -1;
		int maxRow = -1;
		
		int solution[][] =  new int [row][column];
		
		for(int i = 0 ;i < row; i++) {
			solution [i][0] = matrix[i][0];
		}
		
		for(int i = 0 ;i <  column; i++) {
			solution [0][i] = matrix[0][i];
		}
		
		for(int i = 1; i < row; i++) {
			for(int j = 1; j < column; j++) {
				
				if(matrix[i][j]==1) {
					solution[i][j]= Math.min(solution[i][j-1], Math.min(solution[i-1][j], solution[i-1][j-1]))+1;
				}else {
					solution[i][j]=0;
				}
				
			}
		}
		maxSolution = solution[0][0];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(maxSolution < solution[i][j]) {
					maxSolution = solution[i][j];
					maxColumn=j;
					maxRow=i;
				}
			}
		}
		
	   System.out.print((maxColumn-(maxColumn-maxSolution))*(maxRow-(maxRow-maxSolution)));
		                    
	}

}
