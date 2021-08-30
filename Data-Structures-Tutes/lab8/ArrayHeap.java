package lab8;

import java.util.List;
import java.util.ArrayList;

public class ArrayHeap implements Heap{
	
	private List<HeapNode> tree;
	
	public ArrayHeap(){
		this.tree = new ArrayList<HeapNode>();
	}
	
	public int size(){
		return tree.size();
	}
	
	public boolean isEmpty(){
		return tree.isEmpty();
	}
	
	public void insert(int key, Object value){
		tree.add(new HeapNode(key, value));
		
		int currentIndex = tree.size() - 1;
		while (currentIndex != 0) {
			int parentIndex = getParentIndex(currentIndex);
			if (tree.get(currentIndex).key > tree.get(parentIndex).key) {
				return;
			}
			else {
				
				HeapNode temp = tree.get(currentIndex);
				tree.set(currentIndex, tree.get(parentIndex));
				tree.set(parentIndex, temp);
				currentIndex = parentIndex;
			}
		}
		
		return;
	}
	
	public Object removeRoot(){
		if (tree.size() == 1){
			return tree.remove(0).value;
		}
	    Object oldRootValue = tree.get(0).value;
	    HeapNode lastNode = tree.remove(tree.size() - 1);
	    tree.set(0, lastNode);
	    int currentIndex = 0;
	    
	    while(true){
		    int leftChildIndex = getLeftChildIndex(currentIndex);
		    int rightChildIndex = getRightChildIndex(currentIndex);
		    
		    if (leftChildIndex >= tree.size() && rightChildIndex >= tree.size())
				return oldRootValue;
		    int smallestChildIndex;
		    if (leftChildIndex < tree.size() && rightChildIndex < tree.size()) {
			
		    	if (tree.get(leftChildIndex).key < tree.get(rightChildIndex).key) {
		    		smallestChildIndex = leftChildIndex;
		    	} else {
		    		smallestChildIndex = rightChildIndex;
		    	}
		    } else {
		    	smallestChildIndex = leftChildIndex;
		    }
		    
		    if (tree.get(currentIndex).key < tree.get(smallestChildIndex).key)
				return oldRootValue;
		    // Swap node with its child
		    HeapNode temp = tree.get(currentIndex);
		    tree.set(currentIndex, tree.get(smallestChildIndex));
		    tree.set(smallestChildIndex, temp);

		    // Continue checking from the new node's position
		    currentIndex = smallestChildIndex;
	    }
	}
	
	private int getParentIndex(int index){
		return (index - 1)/2;
	}
	
	private int getLeftChildIndex(int index){
		return (2*index) + 1;
	}

	private int getRightChildIndex(int index){
		return (2*index) + 2;
	}

}
