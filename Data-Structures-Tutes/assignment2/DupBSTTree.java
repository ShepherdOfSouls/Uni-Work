package assignment2;


public interface DupBSTTree<K extends Comparable<K>, V> extends BSTTree<K, V> {

	/**
	 * Delete all nodes in tree whose key is equal to k
	 * @param key of the nodes to delete
	 */
	public void deleteAll(K key);	
	
}