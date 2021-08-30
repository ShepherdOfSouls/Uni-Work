package assignment2;

public interface BSTNode<K extends Comparable<K>, V> {

	

	/**
	 * Recovers the value stored in the node
	 * @return the value stored in the node
	 */
	public V getValue();

	/**
	 * Sets the value stored in the node
	 * @param value the value to store in the node
	 */
	public void setValue(V value);
	
	/**
	 * Recovers the key stored in the node
	 * @return the key stored in the node
	 */
	public K getKey();

	/**
	 * Sets the key stored in the node
	 * @param key the key to store in the node
	 */
	public void setKey(K key);	

	/**
	 * Recover the parent stored of the current node
	 * @return the parent of the current node
	 */
	public BSTNode<K, V> getParent();

	/**
	 * Set the parent of the current node
	 * @param parent to set for the current node
	 */
	public void setParent(BSTNode<K, V> parent);

	/**
	 * Recovers the left child of the node
	 * @return the left child of the node
	 */
	public BSTNode<K, V> getLeftChild();
	
	/**
	 * Recovers the right child of the node
	 * @return the right child of the node
	 */
	public BSTNode<K, V> getRightChild();
	
	/**
	 * Sets a new node to be the left child of this node
	 * @param newLeftChild the new left child of this node
	 */
	public void setLeftChild(BSTNode<K, V> newLeftChild);
	
	/**
	 * Sets a new node to be the right child of this node
	 * @param newRightChild the new right child of this node
	 */
	public void setRightChild(BSTNode<K, V> newRightChild);

	/**
	 * Check if the node is a leaf node. A leaf node is a node which has no children
	 * @return true if a leaf node else false
	 */
	public boolean isLeafNode();
	
	/**
	 * Check if the node is a root node. A root node is a node which does not have a parent
	 * @return true if a root node else false
	 */
	public boolean isRootNode();	
	
	/**
	 * recover the height of the tree rooted at the current node
	 * Recall that this must be implemented as an O(1) operation.
	 * @return the height of the tree rooted at the current node
	 */
	public int getHeight();
	
}