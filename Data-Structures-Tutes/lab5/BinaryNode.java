package lab5;
import java.util.ArrayList;
import java.util.List;

public class BinaryNode implements Node{
	private Object element;
	private Node parent;
	private List<Node> children;
	private Node left;
	private Node right;
	
	public BinaryNode(Object element){
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
	
	public Node getLeft(){
		return left;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setRight(Node right){
		this.right = right;
	}

}
