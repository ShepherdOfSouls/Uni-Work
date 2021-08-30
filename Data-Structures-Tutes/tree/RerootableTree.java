package tree;

public interface RerootableTree extends Tree {
	
	/**
	 * Sets a new root node for the current tree. To see how this operation works
	 * check the assignment specifications
	 * @param newRoot the node which will be updated as the root for the current tree
	 */
	public void reRoot(Node newRoot) ;

	/**
	 * Checks if the current tree is a clone of "tree". For more details see assignment specifications
	 * @param tree
	 * @return true if the tree is a clone otherwise false
	 */
	public boolean isClone(Tree tree) ;
}