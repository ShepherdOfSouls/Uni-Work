package lab5;

import java.util.List;

public interface Node {
	
	public Object getElement();
	
	public void setElement(Object element);
	
	public Node getParent();
	
	public void setParent(Node parent);
	
	public List<Node> getChildren();
	
	public void addChild(Node child);
	
	public void removeChild(Node child);
	
	public Node getLeft();
	
	public void setLeft(Node left);
	
	public Node getRight();
	
	public void setRight(Node right);

}
