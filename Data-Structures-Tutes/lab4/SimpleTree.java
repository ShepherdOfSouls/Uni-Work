package lab4;

public class SimpleTree implements Tree{
	private Node root;
	
	public SimpleTree(){
		this.root = null;
	}
	
	private int size(Node root){
		if(root == null){
			return 0;
		}
		
		int total = 1;
		
		for (Node n :root.getChildren()){
			total += size(n);
		}
		
		return total;
	}
	
	public int size(){
		return size(this.root);
	}
	
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setRoot(Node root){
		this.root = root;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public void insert(Node parent, Node child){
		parent.addChild(child);
		child.setParent(parent);
	}
	
	public void remove(Node node){
		while(!node.getChildren().isEmpty()){
			remove(node.getChildren().get(0));
		}
		
		if(node.getParent() == null){
			this.root = null;
		}
		else{
			node.getParent().removeChild(node);
			node.setParent(null);
		}
	}
	

}
