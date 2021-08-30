package lab2;

public class MyNode implements Node{
	private Object data;
	private Node next;
	
	public MyNode(Object object){
		this.data = object;
		this.next = null;
	}
	
	public Object getElement(){
		return this.data;
	}

    public void setElement(Object element){
    	this.data = element;
    }

    public Node getNext(){
    	return this.next;
    }

    public void setNext(Node next){
    	this.next = next;
    }

}
