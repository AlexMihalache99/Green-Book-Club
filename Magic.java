import java.util.Arrays;
/**
 * A magic index is an array of n integers (index from 0 to n-1) is defined to be an index such that a[i] = i;
 *  
 * Part A:
 *    The array is unsorted, what is the most efficient algorithm that can be written and output if there is a magic index or no.
 *    
 * Part B:
 *    The list of integers is sorted in the array. Repeat Part A.
 * 
 * */
public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = { 7, 4, 3, 6, 0};
		
		boolean b = false;
		for(int i = 0; i < array.length ; i++) {
			if(array[i] == i) {
				System.out.println("Yes");
				b = true;
			}
		}
	   
		if ( b == true) {
			System.out.println("No");
		}
		
	    Arrays.sort(array);
	    
	    int left = 0;
	    int right = array.length - 1;
	    
	    b = false;
	    while(left < right) {
	    	
	    	int middle =(left+ right)/2;
	    	
	    	if(array[middle] == middle) {
	    		System.out.println("Yes");
	    		b = true;
	    		break;
	    	} else if(array[middle] > middle) {
	    		right = middle - 1;
	    	} else {
	    		left = middle + 1;
	    	}
	    }
	    
	    if ( b == false) {
			System.out.println("No");
		}
	    
	    
		

	}

}
