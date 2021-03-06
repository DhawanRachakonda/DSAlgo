package dsalgo.liang.bst;

import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
	
	private Node<E> root;
	private int size = 0;
	
	public BST(E[] elements) {
		for (int i=0; i<elements.length; i++) {
			this.insert(elements[i]);
		}
	}
	
	public BST() {
		
	}

	@Override
	public boolean search(E e) {
		boolean isPresent = false;
		Node<E> current = this.root;
		
		while(current != null) {
			if(e.compareTo(current.value) == 0) {
				isPresent = true;
				break;
			}
			if(e.compareTo(current.value) < 0) {
				// go left
				current = current.leftNode;
			} else if(e.compareTo(current.value) > 0) {
				// go right
				current = current.rightNode;
			}
		}
		
		return isPresent;
	}

	@Override
	public boolean insert(E value) {
		if(this.root == null) {
			this.root = new Node<E>(value);
		} else {
			this.root.addValue(value);
		}
		this.size++;
		return true;
	}

	@Override
	public boolean delete(E e) {
		
		Node<E> current = this.root;
		Node<E> parent = null;
		boolean isDeleted = false;
		
		while(current != null) {
			if(current.value.compareTo(e) == 0) {
				break;
			}
			if(e.compareTo(current.value) < 0) {
				// go left;
				current = current.leftNode;
			} else if(e.compareTo(current.value) > 0) {
				// go right;
				current = current.rightNode;
			}
			parent = current;
		}
		
		if(current == null) {
			isDeleted = false;
		}
		else if(current.leftNode == null) {
			// element is to be deleted
			if(parent != null) {
				if(e.compareTo(parent.value) < 0) {
					parent.leftNode = current.rightNode;
				} else {
					parent.rightNode = current.rightNode;
				}
				isDeleted = true;
			} else {
				root = current.rightNode;
			}
			
		} else {
			// Follow any one approach
			// in order predecessor(highest) - Follow this
			// in order successor(least)
			
			Node<E> rightNode = current.leftNode;
			Node<E> parentOfRightestNode = current;
			
			while(rightNode.rightNode != null) {
				parentOfRightestNode = rightNode;
				rightNode = rightNode.rightNode;
			}
			
			// replace value
			current.value = rightNode.value;
			
			// Detach phase
			if(parentOfRightestNode.rightNode == rightNode) {
				parentOfRightestNode.rightNode = rightNode.leftNode;
			} else {
				// current == parent special case
				parentOfRightestNode.leftNode = rightNode.leftNode;
			}
			isDeleted = true;
		}
		this.size--;
		return isDeleted;
	}

	@Override
	public void inorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void clear() {
		this.root = null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
