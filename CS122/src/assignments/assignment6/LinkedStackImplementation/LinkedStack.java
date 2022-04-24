package assignments.assignment6.LinkedStackImplementation;

//***************************************************************
//LinkedStack.java
//
//A linked implementation of an Object stack class with operations push,
//pop, and isEmpty and isFull.
//
//***************************************************************

public class LinkedStack implements StackADT {
	private Node top; // reference to top of stack
	// -----------------------------------------------
	//Constructor -- initializes top
	//---------------------------------------------------

	public LinkedStack() {
	}

	//---------------------------------------------------
	//Adds element to top of stack if it's not full, else
	//does nothing.
	//---------------------------------------------------
	public void push(Object val) {
		if(isEmpty()) {
			top = new Node(val);
		}
		else {
			Node newNode = new Node(val);
			Node temp = top;
			newNode.setNext(temp);
			top = newNode;
		}
	}

	//---------------------------------------------------
	//Removes and returns value at top of stack. If stack
	//is empty returns null.
	//---------------------------------------------------
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		else {
			Object val = top.getElement();
			top = top.getNext();
			return val;
		}
	}

	//---------------------------------------------------
	//Returns true if stack is empty, false otherwise.
	//---------------------------------------------------
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		else {
			return false;
		}
	}

	//---------------------------------------------------
	//Returns true if stack is full, false otherwise.
	//---------------------------------------------------
	public boolean isFull() {
		return false;
	}
}