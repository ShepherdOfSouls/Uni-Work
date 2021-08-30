package lab5;

public class BinaryTree implements Tree{
	
private Node root;
	
	public BinaryTree(){
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
	
	public void insertLeft(Node parent, Node child){
		parent.setLeft(child);
		child.setParent(parent);
	}
	
	public void insertRight(Node parent, Node child){
		parent.setRight(child);
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
	
	public int countLeaves(){
		if (root == null){
			return 0;
		}
		else{
			return countLeaves(root);
		}
	}
	
	private int countLeaves(Node node){
		if((node.getLeft()== null) && (node.getRight() == null)){
			return 0;
		}
		else if((node.getLeft()== null) && (node.getRight() != null)){
			return 1 + countLeaves(node.getRight());
		}
		else if((node.getLeft() != null) && (node.getRight() == null)){
			return 1 + countLeaves(node.getLeft());
		}
		else{
			return 2 + countLeaves(node.getLeft()) + countLeaves(node.getRight());
		}
		
		public boolean twoChildrenOrNone(){
			Node temp = root;
			
			
		}
		
	}
	

}
