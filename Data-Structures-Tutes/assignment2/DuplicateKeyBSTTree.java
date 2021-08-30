package assignment2;


public class DuplicateKeyBSTTree<K extends Comparable<K>, V> extends GenericBSTTree<K, V> implements DupBSTTree<K, V>{
	public DuplicateKeyBSTTree(){
		root = null;
	}
	
	/**
	 * Checks if the Binary Search Tree is balanced
	 * @return true if the binary search tree is balanced otherwise false
	 */
	public boolean isBalanced(){
			
		if((Math.abs(root.getLeftChild().getHeight()- root.getRightChild().getHeight())) > 1){
			return false;
		}
		if(root.getLeftChild().isLeafNode() && root.getRightChild().isLeafNode()){
			return true;
		}
		GenericBSTTree<K, V> leftSubTree = new DuplicateKeyBSTTree();
		leftSubTree.setRoot(root.getLeftChild());
		GenericBSTTree<K, V> rightSubTree = new DuplicateKeyBSTTree();
		rightSubTree.setRoot(root.getRightChild());
	
		if(!leftSubTree.isBalanced() || !rightSubTree.isBalanced()){
			return false;
		}
		
		return true;
	}
	
	/**
	 * insert a new key-value pair in the BST
	 * @param key of the new node
	 * @param value of the new node
	 */
	public void insert(K key, V value){
		BSTNode<K, V> currentNode = find(key);
		while(!currentNode.isLeafNode()){
			GenericBSTTree<K, V> leftSubTree = new DuplicateKeyBSTTree();
			leftSubTree.setRoot(currentNode.getLeftChild());
			currentNode = leftSubTree.find(key);
		}
		currentNode.setKey(key);
		currentNode.setValue(value);
		
		BSTNode<K, V> leftChild = new BinarySearchTreeNode();
		BSTNode<K, V> rightChild = new BinarySearchTreeNode();
		
		currentNode.setLeftChild(leftChild);
		currentNode.setRightChild(rightChild);
		leftChild.setParent(currentNode);
		rightChild.setParent(currentNode);
		
	}
	
	/**
	 * find the node of the tree with the given key
	 * @param key of the node to recover
	 * @return the node that matches the search key. If the key is not found in the tree an
     * empty node (sentinel) is returned that will have null for its value.
	 */	
	public BSTNode<K,V> find(K key){
		BSTNode<K,V> currentNode = root;
		
		while(!currentNode.isLeafNode()){
			
			if(currentNode.getKey() == key){
				return currentNode;
			}
			else if(currentNode.getKey() < key){
				currentNode = currentNode.getLeftChild();
			}
			else if(currentNode.getKey() > key){
				currentNode = currentNode.getRightChild();
			}
		}
		
		return currentNode;
	}
	
	/**
	 * delete the node of the tree with the given key
	 * @param key of the node to delete
	 * @return the node that is deleted, null of no node to delete
	 */
	public BSTNode<K,V> delete(K key){
		BSTNode<K, V> currentNode = find(key);
		BSTNode<K, V> deletedNode = currentNode;
		
		if(currentNode.isLeafNode()){
			return null;
		}
		
		if(!currentNode.getLeftChild().isLeafNode() && !currentNode.getRightChild().isLeafNode()){
			BSTNode<K, V> temp = currentNode.getRightChild();
			while(!temp.getLeftChild().isLeafNode()){
				temp = temp.getLeftChild();
			}
			
			currentNode.setKey(temp.getKey());
			currentNode.setValue(temp.getValue());
			
			temp.getParent().setLeftChild(temp.getRightChild());
			
			temp.getLeftChild().setParent(null);
			temp.getRightChild().setParent(temp.getParent());
			
			temp.setLeftChild(null);
			temp.setRightChild(null);
			temp.setKey(null);
			temp.setValue(null);
			
		}
		
		else if(currentNode.getRightChild().isLeafNode() && currentNode.getLeftChild().isLeafNode()){
			currentNode.getLeftChild().setParent(null);
			currentNode.setLeftChild(null);
			currentNode.getRightChild().setParent(null);
			currentNode.setRightChild(null);
			
			currentNode.setKey(null);
			currentNode.setValue(null);
		}
		
		else if(currentNode.getRightChild().isLeafNode() && !currentNode.getLeftChild().isLeafNode()){
			currentNode.getRightChild().setParent(null);
			currentNode.setKey(currentNode.getLeftChild().getKey());
			currentNode.setValue(currentNode.getLeftChild().getValue());
			
			BSTNode<K, V> tempLeft = currentNode.getLeftChild();
			currentNode.setLeftChild(tempLeft.getLeftChild());
			currentNode.setRightChild(tempLeft.getRightChild());
			tempLeft.setParent(null);
			tempLeft.setLeftChild(null);
			tempLeft.setRightChild(null);
			
		}
		
		else if(!currentNode.getRightChild().isLeafNode() && currentNode.getLeftChild().isLeafNode()){
			currentNode.getLeftChild().setParent(null);
			currentNode.setKey(currentNode.getRightChild().getKey());
			currentNode.setValue(currentNode.getRightChild().getValue());
			
			BSTNode<K, V> tempRight = currentNode.getRightChild();
			currentNode.setLeftChild(tempRight.getLeftChild());
			currentNode.setRightChild(tempRight.getRightChild());
			tempRight.setParent(null);
			tempRight.setLeftChild(null);
			tempRight.setRightChild(null);
			
		}
		
		return deletedNode;
		
	}
	/**
	 * Delete all nodes in tree whose key is equal to k
	 * @param key of the nodes to delete
	 */
	public void deleteAll(K key){
		while(!find(key).isLeafNode()){
			delete(key);
		}
	}
	

}