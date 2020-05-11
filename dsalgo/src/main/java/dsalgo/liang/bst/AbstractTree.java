package dsalgo.liang.bst;

public abstract class AbstractTree<E> implements Tree<E>{

	@Override
	public boolean isEmpty() {
		return getSize() == 0;
	}

}
