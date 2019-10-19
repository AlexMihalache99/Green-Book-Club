/*
 *
 * 1.Given an array A of non-negative integers, return an array consisting of all the even elements of A,followed by all the odd elements of A.

Extension:
Your output array must now be composed of the even array in ascending order, and the odd array in the descending order

 * 
 * */
public class EventsOdds {
	 
	public static int[] sort (int [] array, int length) {
		
		for(int i = 0; i < length ;i++) {
			for(int j = i+1 ;j < length ;j++) {
				if(array[i]>array[j]) {
					int aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		
		
		return array;
	}
	
	public static void array(int [] array) {
		
		int evens[]=new int[array.length];
		int evensLength=0;
		int odds[]=new int[array.length];
		int oddsLength=0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 ==0) {

				evens[evensLength] = array[i];
				evensLength++;
			}else {
				odds[oddsLength] = array[i];
				oddsLength++;
			}
		}
		
		evens=sort(evens,evensLength);
		odds=sort(odds,oddsLength);
		
		for(int i = 0; i < array.length; i++) {
			
			if(evensLength > 0) {
			 array[i] = evens[i];
			 evensLength--;
			}else {
				array[i] = odds[oddsLength-1];
				oddsLength--;
			}
			
		}
	     
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		
		int array[]= {14,25,13,87,65,96,102,12};
		
		array(array);
		
		
		

	}

}
