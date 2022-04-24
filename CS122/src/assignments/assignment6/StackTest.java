
package assignments.assignment6;

//*******************************************************
//StackTest.java
//
//A simple driver to test a stack.
//
//**************************************************

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		// Declare and instantiate a stack
		Stack<Integer> s = new Stack<Integer>();

		// push some stuff on the stack
		for (int i = 0; i < 10; i++)
			s.push(i);

		s.push(5);

		// call printStack to print the stack
		printStack(s);

		// call reverseStack to reverse the stack
		s = reverseStack(s);

		// call printStack to print the stack again
		printStack(s);

		// call removeElement to remove all occurrences of the value 5 - save the stack returned from this call
		Stack<Integer> s2 = new Stack<>();
		for (int num : s) {
			s2.push(num);
		}
		removeElement(s2, 5);
		
		// call printStack to print the original stack and the new stack
		System.out.print("Orginal ");
		printStack(s);
		System.out.print("New ");
		printStack(s2);
	}

	private static void printStack(Stack<Integer> s) {
		System.out.print("Stack: ");
		System.out.println(s.toString());
	}

	private static Stack<Integer> reverseStack(Stack<Integer> s) {
		Stack<Integer> temp = new Stack<Integer>();
		int size = s.size();
		for(int i = 0; i < size; i++){
			temp.push(s.pop());
		}
		return temp;
	}

	private static Stack<Integer> removeElement(Stack<Integer> s, int val) {
		for(int i = 0; i < s.size(); i++) {
			if(s.get(i) == val) {
				s.remove(i);
			}
		}
		return s;
	}
}