/**
 * There are 3 types of edits that can be performed on strings:
 * - insert a character
 * - remove a character
 * - replace a character
 * 
 * Given 2 strings, write a function to check 
 * if they are one edit(or zero edit) away.
 * 
 * EXAMPLE: pale, ple -> true
 *          pale, bale -> true
 *          pale, bake -> false
 * */
public class One_Away {
	
	public static boolean check(String s1, String s2) {
		
		if(Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		
		if(s1.equals(s2)) {
			return true;
		}
		
			
		for(int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			
		 if(s1.charAt(i) != s2.charAt(i)) {
		  String news1 = s1.substring(0, i) + s1.substring(i + 1, s1.length());
		  String news2 = s2.substring(0, i) + s2.substring(i + 1, s2.length());
		  String news = s1.replace(s1.charAt(i), s2.charAt(i));
			
		
		 if(news1.equals(s2) || s1.equals(news2) || news.equals(s2)) {
		  return true;
		}else {
			return false;
		}
		 
		}
		
		}
		
		if(s1.length() > s2.length()) {
			s1 = s1.substring(0, s1.length() - 1);
			
			if(s1.equals(s2)) {
				return true;
			}else {
				return false;
			}
		}else {
            s2 = s2.substring(0, s2.length() - 1);
			
			if(s1.equals(s2)) {
				return true;
			}else {
				return false;
			}
			
		}
		

	}

	public static void main(String[] args) {
		
		System.out.print(check("alex", "blix"));

	}

}
