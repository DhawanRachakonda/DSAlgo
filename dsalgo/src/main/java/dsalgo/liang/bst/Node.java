package dsalgo.liang.bst;

public class Node<E extends Comparable<E>> {

	protected Node<E> leftNode;
	protected E value;
	protected Node<E> rightNode;
	
	public Node(E value) {
		this.value = value;
	}
	
	public void addValue(E value) {
		if(value.compareTo(this.value) < 0) {
			// go left
			if(leftNode == null) {
				leftNode = new Node<E>(value);
			} else {
				this.leftNode.addValue(value);
			}
		} else if(value.compareTo(this.value) > 0) {
			// go right
			if(rightNode == null) {
				this.rightNode = new Node<E>(value);
			} else {
				this.rightNode.addValue(value);
			}
		}
	}
	
}
