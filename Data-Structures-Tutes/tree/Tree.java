package tree;

public interface Tree {
	
	/**
	 * Calculates the size of the tree. 
	 * @return the number of internal and leaf nodes in the tree
	 */
	public int size();

	/**
	 * Checks if the tree is empty
	 * @return true if the tree contains no nodes else false
	 */
	public boolean isEmpty();

	/**
	 * Computes the maximum height of the tree
	 * @return the maximum height of the tree
	 */	
	public int getHeight();
	
	/**
	 * Adds a node as the root of the tree
	 * @param root add a node as the root of the tree
	 */
	public void setRoot(Node root);

	/**
	 * Recovers the root of the tree
	 * @return the root node of the tree
	 */
	public Node getRoot();
	
	/**
	 * Recovers the distance between the root node and the query node. 
	 * The distance is in terms of the number of edges between the query node
	 * and the root.
	 * returns a value less than zero if root or node is null
	 * @param node is the initial location of the query
	 * @return the distance from node to the root
	 */
	public int distanceToRoot(Node node);
	
}
