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
		Node<E> current = null;
		
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
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
