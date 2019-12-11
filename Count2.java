/**
 * 
 * 
 * Write a method to count the number of twos (2) that appear between the number 0 and n (For a given n).
	Example:
		Input: 25
		Output: 9
		Why?: 2, 12, 20, 21, 22, 23, 24, 25
	
	Part A:
		Assume n < 10000. How fast can you go?
		
	Part B:
		No restrictions on the value of n. How fast can you go?
 * */


public class Count2 {
	  
    public static int count2sinRangeAtDigit(int number, int d)  
    { 
        int pow = (int) Math.pow(10, d); 
        int nextpow = pow * 10; 
        int right = number % pow; 
  
        int down = number - number % nextpow; 
        int up = down + nextpow; 
  
        int digit = (number / pow) % 10; 
  
        if (digit < 2){ 
            return down / 10; 
        } 
  
        if (digit == 2) { 
            return down / 10 + right + 1; 
        } 
        return up / 10; 
    } 
   
    public static int counter(int number)  
    { 

    	String convert = String.valueOf(number);  
        int length = convert.length(); 
   
        int count = 0; 
        for (int digit = 0; digit < length; digit++) { 
            count += count2sinRangeAtDigit(number, digit); 
        } 
  
        return count; 
    } 
  
    public static void main(String[] args) { 
        System.out.println(counter(12));  
    } 


}
