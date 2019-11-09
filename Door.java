/**
 * There are 100 doors in a dungeon. A prisoner, to survive, must execute the following algorithm:
			1. They open all doors. 
			2. They close every second door. 
			3. They toggle every third door, 

		The process continues, for 100 passes, such that for each pass n, the prisoner toggles every nth door;
		When the algorithm completes, the evil genius releases her monsters. 
		The monsters will come out of every open door. 

		Question A:
			How many monsters attack her poor prisoner?
	
		Question B:
			Our evil genius, likes to make abstract math a reality. She instead creates d many doors
			(where d is any natural number she pleases). 
			Given d many doors, and d many passes of the algorithm, express the number of monsters that
			attack their poor prisoner as a function f(d)
 * */
public class Door {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean array[] = new boolean [101];
		int count =0;
		
		for(int i = 1; i<=100;i++) {
			array[i]= false;
	 }
        
		for(int i =1 ;i<= 10;i++) {
			 array[i*i] = true;	
		}
		for(int i = 1;i<= 100;i++) {
			if(array[i]==true) {
				count++;
			}
		}
		
		System.out.println(count);
		
		///Answer for question B : floor( square root of d)
	}
}
