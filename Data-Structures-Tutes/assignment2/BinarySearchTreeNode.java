package assignment2;


public class BinarySearchTreeNode<K extends Comparable<K>, V> implements BSTNode<K, V> {


	private K key;
	private V value;
	private BSTNode<K, V> parent;
	private BSTNode<K, V> leftChild;
	private BSTNode<K, V> rightChild;
	p int size;
	
	
	public BinarySearchTreeNode(){
		key = null;
		value = null;
		parent = null;
		leftChild = null;
		rightChild = null;
	}
	
	
	
	/**
	 * Recovers the value stored in the node
	 * @return the value stored in the node
	 */
	public V getValue(){
		return value;
	}

	/**
	 * Sets the value stored in the node
	 * @param value the value to store in the node
	 */
	public void setValue(V value){
		this.value = value;
	}
	
	/**
	 * Recovers the key stored in the node
	 * @return the key stored in the node
	 */
	public K getKey(){
		return key;
	}

	/**
	 * Sets the key stored in the node
	 * @param key the key to store in the node
	 */
	public void setKey(K key){
		this.key = key;
	}

	/**
	 * Recover the parent stored of the current node
	 * @return the parent of the current node
	 */
	public BSTNode<K, V> getParent(){
		return parent;
	}

	/**
	 * Set the parent of the current node
	 * @param parent to set for the current node
	 */
	public void setParent(BSTNode<K, V> parent){
		this.parent = parent;
	}

	/**
	 * Recovers the left child of the node
	 * @return the left child of the node
	 */
	public BSTNode<K, V> getLeftChild(){
		return leftChild;
	}
	
	/**
	 * Recovers the right child of the node
	 * @return the right child of the node
	 */
	public BSTNode<K, V> getRightChild(){
		return rightChild;
	}
	
	/**
	 * Sets a new node to be the left child of this node
	 * @param newLeftChild the new left child of this node
	 */
	public void setLeftChild(BSTNode<K, V> newLeftChild){
		this.leftChild = newLeftChild;
	}
	
	/**
	 * Sets a new node to be the right child of this node
	 * @param newRightChild the new right child of this node
	 */
	public void setRightChild(BSTNode<K, V> newRightChild){
		this.rightChild = newRightChild;
	}

	/**
	 * Check if the node is a leaf node. A leaf node is a node which has no children
	 * @return true if a leaf node else false
	 */
	public boolean isLeafNode(){
		if(leftChild == null && rightChild == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Check if the node is a root node. A root node is a node which does not have a parent
	 * @return true if a root node else false
	 */
	public boolean isRootNode(){
		if (parent == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * recover the height of the tree rooted at the current node
	 * Recall that this must be implemented as an O(1) operation.
	 * @return the height of the tree rooted at the current node
	 */
	public int getHeight(){
		int leftheight = 0;
		int rightheight = 0;
		if (leftChild != null) {
		leftheight = leftChild.getHeight();
		}
		if (rightChild != null) {
		rightheight = rightChild.getHeight();
		}
		if (leftheight > rightheight) {
		return 1+leftheight;
		} else {
		return 1+rightheight;
		}
		
	}
	
    public String toString() {
        return " " + key;
    }
}
