package lab5;

public interface Tree {
	public int size();
	
	public boolean isEmpty();
	
	public void setRoot(Node root);
	
	public Node getRoot();
	
	public void insertLeft(Node parent, Node child);
	
	public void insertRight(Node parent, Node child);
	
	public void remove(Node node);

}
