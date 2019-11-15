/**
 * You have a computer that only 'knows' addition and negation of integers (E.g. can turn -4 to 4 and 4 to -4)
 * 
 * Part A:
 *		Define subtraction using only the above two operations
 *
 *	Part B:
 *		Define multiplication using the above three operations
 *
 *	Part C:
 *		Define division using the above four operations.
 */
	
	
public class Operations {
    
	public static int subtraction(int x, int y) {
		
		y = -y;
		int subtraction = y + x;
		
		return subtraction;
	}
	
    public static int multiplication(int x, int y) {
		
    	int m = 0;
		
    	while(y != 0) {
    	 m += x;
    	 y = subtraction(y, 1);
    	}
		
		return m;
	}
    
    public static int division(int x, int y) {
    	
    	int d = 0;
    	
    	while(x != 0) {
    		x = subtraction(x,y);
    		d++;
    		 
    		if( x < y ) {
    			x = 0;
    		}
    	}
    	
    	return d;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int y = 10;
		
		System.out.print(subtraction(x, y) + " " + multiplication(x, y) + " " + division(x, y));
		
		
		
		
		

	}

}
