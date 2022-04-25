package projects.project1;

public class Node {
	private Node next;
	private Object value;

	public Node() {
		next = null;
		value = null;
	}

	public Node(Object value) {
		next = null;
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		next = node;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}