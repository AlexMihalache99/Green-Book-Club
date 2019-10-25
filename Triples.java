/*
 * Given an array nums of n integers, find all triples that sum to zero.
 * 
 * */

import java.util.Arrays;

public class Triples {
	
	public static void triples(int [] array) {
		
		Arrays.sort(array);
		
		for(int i=0; i< array.length-1;i++) {
			int left = i+1;
			int right = array.length -1;
			int aux = array[i];
			
			while(left<right) {
			if(aux+array[left]+array[right]==0) {
				
				System.out.println(aux+" "+array[left]+" "+array[right]);
				left++;
				right--;
			}else if(aux+array[left]+array[right] > 0) {
				 right--;
			}else {
				left++;
			}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int [] array = {-1,0,1,2,-2,2,-4};
		
		triples(array);
	}

}
