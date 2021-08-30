package assignment2;


public interface FrontBSTTree<K extends Comparable<K>, V> extends BSTTree<K, V> {

	/**
	 * Inserts a new node in the tree, using insertion at the root
	 * @param newnode the node  to be inserted and become the root for the current tree
	 */
	public void insertAsRoot(BSTNode<K,V> newnode) ;

	/**
	 * Find and remove the k-th smallest element in the tree
	 * @param k the k-th value for the key
	 * @return node with the k-th smallest key in the tree
	 */
	public BSTNode<K,V> deleteKth(int k) ;
	
}