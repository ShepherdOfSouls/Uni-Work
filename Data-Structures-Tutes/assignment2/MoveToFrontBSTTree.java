package assignment2;


public class MoveToFrontBSTTree<K extends Comparable<K>, V> extends GenericBSTTree<K, V> implements FrontBSTTree<K, V>{
	
	public MoveToFrontBSTTree(){
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
		GenericBSTTree<K, V> leftSubTree = new MoveToFrontBSTTree();
		leftSubTree.setRoot(root.getLeftChild());
		GenericBSTTree<K, V> rightSubTree = new MoveToFrontBSTTree();
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
	 * Inserts a new node in the tree, using insertion at the root
	 * @param newnode the node  to be inserted and become the root for the current tree
	 */
	public void insertAsRoot(BSTNode<K,V> newnode){
		GenericBSTTree<K, V> oldTree = new MoveToFrontBSTTree();
		oldTree.setRoot(this.root);
		this.root = newnode;
		BSTNode<K, V> newLeft  = new BinarySearchTreeNode();
		newLeft.setParent(root);
		root.setLeftChild(newLeft);
		BSTNode<K, V> newRight  = new BinarySearchTreeNode();
		newRight.setParent(root);
		root.setLeftChild(newRight);
		
		while(!oldTree.getRoot().isLeafNode()){
			BSTNode<K, V> entryPoint = find(oldTree.getRoot().getKey());
			BSTNode<K, V> replacementNode = new BinarySearchTreeNode();
			if(oldTree.getRoot().getKey() > root.getKey()){
				BSTNode<K,V> temp = oldTree.getRoot().getLeftChild();
				oldTree.getRoot().setLeftChild(null);
				temp.setParent(null);
				entryPoint.setKey(oldTree.getRoot().getKey());
				entryPoint.setValue(oldTree.getRoot().getValue());
				entryPoint.setLeftChild(replacementNode);
				entryPoint.setRightChild(oldTree.getRoot().getRightChild());
				oldTree.getRoot().getRightChild().setParent(entryPoint);
				oldTree.getRoot().setRightChild(null);
				oldTree.setRoot(temp);
			}
			else if(oldTree.getRoot().getKey() < root.getKey()){
				BSTNode<K,V> temp = oldTree.getRoot().getRightChild();
				oldTree.getRoot().setRightChild(null);
				temp.setParent(null);
				entryPoint.setKey(oldTree.getRoot().getKey());
				entryPoint.setValue(oldTree.getRoot().getValue());
				entryPoint.setRightChild(replacementNode);
				entryPoint.setLeftChild(oldTree.getRoot().getRightChild());
				oldTree.getRoot().getLeftChild().setParent(entryPoint);
				oldTree.getRoot().setLeftChild(null);
				oldTree.setRoot(temp);
			}
		}
		
	}

	/**
	 * Find and remove the k-th smallest element in the tree
	 * @param k the k-th value for the key
	 * @return node with the k-th smallest key in the tree
	 */
	public BSTNode<K,V> deleteKth(int k){
		BSTNode<K, V> currentNode = root;
		boolean found = false;
		
		while(!found){
			int leftSize = currentNode.getLeftChild().getSize();
			if((leftSize + 1) == k){
				found = true;
			}
			else if((leftSize + 1) < k){
				currentNode = currentNode.getRightChild();
				k = k - (leftSize + 1);
			}
			else if((leftSize + 1) > k){
				currentNode = currentNode.getLeftChild();
			}
		}
		
		
		return delete(currentNode.getKey());
	}

}