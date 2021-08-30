package tree;

import java.util.List;

public interface Node {
	
	/**
	 * Recovers the value stored in the node
	 * @return the object stored in the node
	 */
	public Object getElement();

	/**
	 * Sets the value stored in the node
	 * @param element the value to store in the node
	 */
	public void setElement(Object element);

	/**
	 * Recover the parent stored of the current node
	 * @return the parent of the current node
	 */
	public Node getParent();

	/**
	 * Set the parent of the current node
	 * @param parent to set for the current node
	 */
	public void setParent(Node parent);

	/**
	 * Recover a list of children in order from left to right for the node
	 * @return a list of children for the node
	 */
	public List<Node> getChildren();

	/**
	 * Append a child node to the list of children in the order from left to right
	 * @param child the new node to add to the list of children
	 */	
	public void addChild(Node child);

	/**
	 * Remove a child node from the list of children
	 * @param child the new node to remove from the list of children
	 */		
	public void removeChild(Node child);

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
}
