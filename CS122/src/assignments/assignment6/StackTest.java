package assignments.assignment6;

//*******************************************************
//StackTest.java
//
//A simple driver that exercises push, pop, isFull and isEmpty.
//Thanks to autoboxing, we can push integers onto a stack of Objects.
//
//*******************************************************

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		StackADT stack = new LinkedStack();
		
		//push some stuff on the stack
		for (int i = 0; i < 10; i++)
			stack.push(i * 2);
		
		//pop and print
		//should print 18 16 14 12 10 8 6 4 2 0
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		
		// push a few more things
		for (int i = 1; i <= 6; i++)
			stack.push(i);
		
		// should print 6 5 4 3 2 1
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		
		//Stack Manipulation
		// Declare and instantiate a stack
		Stack stack = new Stack();
		
		// push some stuff on the stack
		for (int i = 0; i < 10; i++)
			stack.push(i);
		
		stack.push(5);
		// call printStack to print the stack
		// call reverseStack to reverse the stack
		// call printStack to print the stack again
		// call removeElement to remove all occurrences of the value 5 - save the
		// stack returned from this call
		// call printStack to print the original stack and the new stac
	}
}