package projects.project1;

public class Linkedlist<T> {
	private Node front;
	
	public Linkedlist() {
		front = null;
	}
	
	public void add(T value) {
		if(value == null)
			return;
		else if(front == null)
			front = new Node(value);
		else {
			Node temp = front;
			
			while(temp != null) {
				temp = temp.getNext();
			}
			
			temp = new Node(value);
		}
	}
	
	public void remove() {
		if(front.getNext() == null || front == null)
			front = null;
		else
			front = front.getNext();
	}
	
	public void clear() {
		front = null;
	}
	
	public String toString() {
		if(front == null)
			return "null";
		else {
			Node temp = front;
			String str = "";
			
			while(temp != null) {
				str = str + temp.getValue() + " -> ";
			}
			
			str+= "null";
			
			return str;
		}
	}
}
