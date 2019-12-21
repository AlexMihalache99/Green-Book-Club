import java.util.Scanner;

/**
 * Given a list of daily temperatures, return a list such that, for each day in the input,
	tells you how many days you would have to wait until a warmer temperature. 
	If there is no future day for which this is possible, put 0 instead.

	Example:
		 Input:  [73, 74, 75, 71, 69, 72, 76, 73]
		 Output: [ 1,  1,  4,  2,  1,  1,  0,  0]
 * */

public class Temperature {
    
	
	public static int[] f(int [] array) {
		
		int n = array.length;
		int [] v = new int[n];
		
		for(int i = 0; i < n - 2; i++) {
			
			for(int j = i + 1; j < n; j++) {
				v[i]++;
				if(array[i] < array[j]) {
					break;
				}
			}
			
		}
		
		if(array[n - 2] < array[n - 1]) {
			v[n - 2] ++;
		}
		
		return v;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] v = new int[n];
		
		for(int i = 0; i < n; i++) {
		  v[i] = in.nextInt();	
		}
		
		v = f(v);
		
		for(int i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}
       in.close();
	}

}
