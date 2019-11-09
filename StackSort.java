import java.util.*;
/**
 * Write a program to sort a stack with the smallest items on top.
		Recall that the allowed operations on a stack are: Push, Pop, Peek and isEmpty. 

 * */

public class StackSort {
	
	public static Stack <Integer>  sort(Stack <Integer> stack){
		
		Stack <Integer> additionalStack = new Stack <Integer>();
		
		while(!stack.isEmpty()) {
		 	int aux = stack.pop();
		 	
		 	while(!additionalStack.isEmpty() && additionalStack.peek() < aux) {
		 		stack.push(additionalStack.pop());
		 	}
		 	
		 	additionalStack.push(aux);
		}
		
		return additionalStack;
		
	}
	
	public static void main(String[] args) {
		
		Stack <Integer> stack = new Stack <Integer>();
		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		
		Stack <Integer> stack1 = sort(stack);
		
		while(!stack1.isEmpty()) {
			System.out.print(stack1.peek() + " ");
			stack1.pop();
		}
	}
    
	

}
