import java.util.Stack;

/*
 * Given an input containing parenthesis, write a function to decide
 * if the paranthesis are matched. That is, for every opening paranthesis
 * there must be a respective closing parenthesis and vice versa.
 * 
 * */
public class Paranthesies {
	
	public static boolean paranthesis(String str) {
		
		Stack <Character> stack = new Stack<Character>();
		
		for(int i =0; i < str.length(); i++) {
			
			if(str.charAt(i) == '(') {
				stack.push('(');
			}else if(str.charAt(i) == ')') {
				
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
				
			}
			
		}
		
		
		if(stack.isEmpty()) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
        String str = "()()()()()()()()()()123()()()()))((";
        
        System.out.print(paranthesis(str));
		
        

	}

}
