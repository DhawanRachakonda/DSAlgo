package dsalgo.liang.bst;

public interface Tree<E> extends Iterable<E> {

	/**
	 * Searches for an element in tree
	 * @param e
	 * @return
	 */
	boolean search(E e);
	
	/**
	 * inserts an element in a tree
	 * @param e
	 * @return
	 */
	boolean insert(E e);
	
	/**
	 * Deletes a node from tree, updating all its children to parent
	 * of the deleted node
	 * @param e
	 * @return
	 */
	boolean delete(E e);
	
	/**
	 * in order traversal
	 */
	void inorder();
	
	/**
	 * post order traversal
	 */
	void postOrder();
	
	/**
	 * pre order traversal
	 */
	void preOrder();
	
	/**
	 * Nodes present in the tree
	 * @return
	 */
	int getSize();
	
	/**
	 * Does tree have any nodes
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * Removes all nodes present in the tree
	 */
	void clear();
	
}
