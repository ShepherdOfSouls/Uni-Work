package lab4;

import java.util.ArrayList;
import java.util.List;

public class SimpleNode implements Node{
	private Object element;
	private Node parent;
	private List<Node> children;
	
	public SimpleNode(Object element){
		this.element = element;
		this.parent = null;
		this.children = new ArrayList<Node>();
	}
	
	public Object getElement(){
		return element;
	}
	
	public void setElement(Object element){
		this.element = element;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
	
	public List<Node> getChildren(){
		return children;
	}
	
	public void addChild(Node child){
		children.add(child);
	}
	
	public void removeChild(Node child){
		children.remove(child);
	}

}
