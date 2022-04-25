package assignments.assignment5.LinkedQueueImplementation;

//***********************************************************
//LinkedQueue.java
//A linked-list implementation of the classic FIFO queue interface.
//***********************************************************

public class LinkedQueue implements QueueADT {

	private Node front, back;
	private int numElements;

	// ---------------------------------------------
	// Constructor; initializes the front and back pointers
	// and the number of elements.
	// ---------------------------------------------
	public LinkedQueue() {
		front = back = null;
		numElements = 0;
	}

	// ---------------------------------------------
	// Puts item on end of queue.
	// ---------------------------------------------
	public void enqueue(Object item) {
		if(front == null) {
			Node temp = new Node(item);
			front = back = temp;
		}
		else {
			Node newNode = new Node(item);
			Node temp = front;
			
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
			back = newNode;
		}
		
		numElements++;
	}

	// ---------------------------------------------
	// Removes and returns object from front of queue.
	// ---------------------------------------------
	public Object dequeue() {
		if(front == null) {
			return null;
		}
		else if(front.getNext() == null) {
			numElements--;
			Object obj = front.getElement();
			front = back = null;
			return obj;
		}
		else {
			numElements--;
			Object obj = front.getElement();
			front.setElement(front.getNext().getElement());
			front.setNext(front.getNext().getNext());
			Node temp = front;
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			back = temp;
			return obj;
		}
	}

	// ---------------------------------------------
	// Returns true if queue is empty.
	// ---------------------------------------------
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}

	// ---------------------------------------------
	// Returns true if queue is full, but it never is.
	// ---------------------------------------------
	public boolean isFull() {
		return false;
	}

	// ---------------------------------------------
	// Returns the number of elements in the queue.
	// ---------------------------------------------
	public int size() {
		return numElements;
	}

	// ---------------------------------------------
	// Returns a string containing the elements of the queue
	// from first to last
	// ---------------------------------------------
	public String toString() {
		String result = "\n";
		Node temp = front;
		while (temp != null) {
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}