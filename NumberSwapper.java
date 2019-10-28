/*
 * Write a function to swap a number in place( that is, without temporary variables).
 * 
 * */
public class NumberSwapper {
	
	public static void swap(int x, int y) {
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.print(x + " " + y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		swap(25,42);
	}

}
