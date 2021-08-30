package assignment2;


public interface BSTTree<K extends Comparable<K>, V> {

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
	public void setRoot(BSTNode<K, V> root);	
	
	/**
	 * Recovers the root of the tree
	 * @return the root node of the tree
	 */
	public BSTNode<K, V> getRoot();	
	
	/**
	 * Recovers the distance between the root node and the query node. 
	 * The distance is in terms of the number of edges between the query node
	 * and the root.
	 * @param node is the initial location of the query
	 * @return the distance from node to the root
	 */
	public int distanceToRoot(BSTNode<K, V> node);
	
	/**
	 * Checks if the Binary Search Tree is balanced
	 * @return true if the binary search tree is balanced otherwise false
	 */
	public boolean isBalanced();
	
	/**
	 * insert a new key-value pair in the BST
	 * @param key of the new node
	 * @param value of the new node
	 */
	public void insert(K key, V value);		
	
	/**
	 * find the node of the tree with the given key
	 * @param key of the node to recover
	 * @return the node that matches the search key. If the key is not found in the tree an
     * empty node (sentinel) is returned that will have null for its value.
	 */	
	public BSTNode<K,V> find(K key);		
	
	/**
	 * delete the node of the tree with the given key
	 * @param key of the node to delete
	 * @return the node that is deleted, null of no node to delete
	 */
	public BSTNode<K,V> delete(K key);
}
