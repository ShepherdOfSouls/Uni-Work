package assignment2;



public abstract class GenericBSTTree<K extends Comparable<K>, V> implements BSTTree<K, V>{

	protected BSTNode<K, V> root;
	
	public GenericBSTTree(){
		this.root = null;
	}
	
	/**
	 * Calculates the size of the tree. 
	 * @return the number of internal and leaf nodes in the tree
	 */
	public int size(){
		return root.size;
	}
	
	/**
	 * Checks if the tree is empty
	 * @return true if the tree contains no nodes else false
	 */
	public boolean isEmpty(){
		if(root == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Computes the maximum height of the tree
	 * @return the maximum height of the tree
	 */	
	public int getHeight(){
		if(root == null){
			return 0;
		}
		
		return root.getHeight();
	}
	
	/**
	 * Adds a node as the root of the tree
	 * @param root add a node as the root of the tree
	 */
	public void setRoot(BSTNode<K, V> root){
		this.root = root;
	}
	
	/**
	 * Recovers the root of the tree
	 * @return the root node of the tree
	 */
	public BSTNode<K, V> getRoot(){
		return root;
	}
	
	/**
	 * Recovers the distance between the root node and the query node. 
	 * The distance is in terms of the number of edges between the query node
	 * and the root.
	 * @param node is the initial location of the query
	 * @return the distance from node to the root
	 */
	public int distanceToRoot(BSTNode<K, V> node){
		BSTNode<K,V> currentNode = node;
		int distance = 0;
		
		while(currentNode != root){
			currentNode = currentNode.getParent();
			distance++;
		}
		
		return distance;
	}
	
	
  public String toString()
  {
      return root.toString();
  }
    
}