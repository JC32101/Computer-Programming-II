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
			Node node = new Node(value);
			Node temp = front;
			
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			
			temp.setNext(node);
		}
	}
	
	public void remove() {
		if(front == null || front.getNext() == null)
			front = null;
		else
			front = front.getNext();
	}
	
	public void clear() {
		front = null;
	}
	
	public String print() {
		if(front == null)
			return "null";
		else {
			Node temp = front;
			String str = "";
			
			while(temp != null) {
				str = str + temp.getValue() + " -> ";
				temp = temp.getNext();
			}
			
			str+= "null";
			
			return str;
		}
	}
}
