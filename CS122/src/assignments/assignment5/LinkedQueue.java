package assignments.assignment5;

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
	}

	// ---------------------------------------------
	// Puts item on end of queue.
	// ---------------------------------------------
	public void enqueue(Object item) {
	}

	// ---------------------------------------------
	// Removes and returns object from front of queue.
	// ---------------------------------------------
	public Object dequeue() {
		Object item = null;
	}

	// ---------------------------------------------
	// Returns true if queue is empty.
	// ---------------------------------------------
	public boolean isEmpty() {
	}

	// ---------------------------------------------
	// Returns true if queue is full, but it never is.
	// ---------------------------------------------
	public boolean isFull() {
	}

	// ---------------------------------------------
	// Returns the number of elements in the queue.
	// ---------------------------------------------
	public int size() {
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