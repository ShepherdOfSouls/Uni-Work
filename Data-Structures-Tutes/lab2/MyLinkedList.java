package lab2;

public class MyLinkedList implements LinkedListInt{
	
	protected Node head;
	
	public MyLinkedList()
	{
		this.head = null;
	}
	
	public Node getHead()
	{
		return head;
	}
	public int size()
	{
		int size = 0;
		Node current = head;
		while (current != null)
		{
			size++;
			current = current.getNext();
		}
		return size;
	}
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Object get(int i)
	{
		int index = 0;
		Node current = head;
		while (current != null && index != i)
		{
			index++;
			current = current.getNext();
		}
		if (current == null)
		{
			return null;
		}
		return current.getElement();
	}
	public void add(Object o)
	{
		if (head == null)
		{
			head = new MyNode(o);
			return;
		}
		Node current = head;
		while (current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(new MyNode(o));
	}
	public void remove(Object o)
	{
		if (head == null) {
			return;
		}
		
		Node current = head;
		while (current.getNext() != null && current.getNext().getElement() != o)
		{
			current = current.getNext();
		}
		
		if (head.getElement() == o) {
			  head = head.getNext();
			  return;
		      }
		
		if(current.getNext() == null){
			return;
		}
		
		current.setNext(current.getNext().getNext());
	}

}
