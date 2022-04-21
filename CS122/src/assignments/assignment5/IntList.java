package assignments.assignment5;

//***************************************************************
//FILE: IntList.java
//
//Purpose: Defines a class that represents a list of integers
//
//***************************************************************

public class IntList {
	private IntNode front; // first node in list

	// -----------------------------------------
	// Constructor. Initially list is empty.
	// -----------------------------------------
	public IntList() {
		front = null;
	}
	
	public int length() {
		IntNode temp = front;
		int count = 0;
		
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public String toString() {
		IntNode temp = front;
		String val = "" + temp.val;
		
		while(temp.next != null) {
			temp = temp.next;
			val = " " + temp.val;
		}
		
		return val;
	}
	
	public void removeLast() {
		if(front != null) {
			IntNode temp = front;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	
	public void replace(int oldVal, int newVal) {
		if(front != null) {
			IntNode temp = front;
			
			while(temp.next != null) {
				if(temp.val == oldVal)
					temp.val = newVal;
				temp = temp.next;
			}
		}
	}

	// -----------------------------------------
	// Adds given integer to front of list.
	// -----------------------------------------
	public void addToFront(int val) {
		front = new IntNode(val, front);
	}

	// -----------------------------------------
	// Adds given integer to end of list.
	// -----------------------------------------
	public void addToEnd(int val) {
		IntNode newnode = new IntNode(val, null);
		// if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else {
			// make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			// link new node into list
			temp.next = newnode;
		}
	}

	// -----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	// -----------------------------------------
	public void removeFirst() {
		if (front != null)
			front = front.next;
	}

	// ------------------------------------------------
	// Prints the list elements from first to last.
	// ------------------------------------------------
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}

	// *************************************************************
	// An inner class that represents a node in the integer list.
	// The public variables are accessed by the IntList class.
	// *************************************************************
	private class IntNode {
		public int val; // value stored in node
		public IntNode next; // link to next node in list

		// ------------------------------------------------------------------
		// Constructor; sets up the node given a value and IntNode reference
		// ------------------------------------------------------------------
		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}
}