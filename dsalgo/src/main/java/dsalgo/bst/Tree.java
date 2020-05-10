package dsalgo.bst;

public class Tree {

	private SiblingTree node;

	public Tree(int value) {
		this.node = new SiblingTree(value, -1);
	}

	public Tree() {
		this.node = null;
	}

	public void addValue(int value) {
		if (this.node == null) {
			this.node = new SiblingTree(value, -1);
		} else {
			this.node.addValue(value);
		}
	}

	public Node getNode() {
		return node;
	}

	public void setNode(SiblingTree node) {
		this.node = node;
	}
	
	public void printTree() {
		this.node.printNodeDetails();
	}
	
	public boolean areSibling(int node1, int node2) {
		Node n1 = this.node;
		int h1 = 1;
		SiblingTree foundNode = null;
		while(true) {
			if(n1.value == node1) {
				foundNode = (SiblingTree) n1;
				break;
			} else if(n1.leftNode != null || n1.rightNode != null) {
				if(n1.value > node1) {
					h1 += 1;
					n1 = n1.leftNode;
				} else if(n1.value > node1) {
					h1 += 1;
					n1 = n1.rightNode;
				}
			} else {
				break;
			}
		}
		
		Node n2 = this.node;
		SiblingTree foundNode2 = null;
		int h2 = 1;
		while(true) {
			if(n2.value == node2) {
				foundNode2 = (SiblingTree) n2;
				break;
			} else if(n2.leftNode != null || n2.rightNode != null) {
				if(n1.value > node2) {
					h2 += 1;
					n2 = n2.leftNode;
				} else if(n1.value < node2) {
					h2 += 1;
					n2 = n2.rightNode;
				}
			} else {
				break;
			}
		}
		
		if(h1 == h2 && foundNode!= null && foundNode2 != null &&foundNode.getParent() != foundNode2.getParent()) {
			System.out.println("Matched");
			return true;
		}
		
		System.out.println("Not a sibling");
		return false;
	}

	@Override
	public String toString() {
		return "Tree [node=" + node + "]";
	}
}
