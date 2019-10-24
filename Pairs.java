import java.util.Arrays;

/*
 * Given an array nums of n integers, find all pairs that sum to zero.
 * 
 * 
 * 
 * */
public class Pairs {

	public static void pairs(int[] array) {
		
		Arrays.sort(array);
		
		int i=0;
		int j=array.length-1;
		
		while(i < j) {
			
			if(array[i] + array[j] > 0) {
				j--;
			}else if (array[i] + array[j] < 0) {
				i++;
			}else {
				System.out.println(array[i]+" "+array[j]);
				i++;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int [] array = {-1, 0, 1, 2, -2, -4};
		
		pairs(array);
		
		
	}

}
