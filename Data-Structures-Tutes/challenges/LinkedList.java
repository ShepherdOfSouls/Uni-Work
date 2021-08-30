package challenges;

public class LinkedList {
	public Node head;

	public LinkedList() {
		head = null;
	}

	public int size() {
		if (head == null)
			return 0;
		int count = 1;
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
			count++;
		}
		return count;
	}

	public Node getHead() {
		return head;
	}   

	public void addFront(Node n) {
		n.next = head;
		head = n;
	}

	public void clear() {
		head = null;
	}
}

