package dsalgo.bst;

public class Node {

	protected Node leftNode;
	protected int value;
	protected Node rightNode;

	public Node(int value) {
		this.value = value;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public void addValue(int value) {
		if (this.value > value) {
			// go left
			if (this.leftNode != null) {
				this.leftNode.addValue(value);
			} else {
				this.leftNode = new Node(value);
			}
		} else {
			// go right
			if (this.rightNode != null) {
				this.rightNode.addValue(value);
			} else {
				this.rightNode = new Node(value);
			}
		}
	}
	
	public void printNodeDetails() {
		System.out.println(String.format("Node Value %d", this.value));
		System.out.println("Left Node Details");
		if(this.leftNode != null) {
			this.leftNode.printNodeDetails();
		} else {
			System.out.println(String.format("%d Doesn't have any left node", this.value));
		}
		System.out.println("Right Node Details");
		if(this.rightNode != null) {
			this.rightNode.printNodeDetails();
		} else {
			System.out.println(String.format("%d Doesn't have any right node", this.value));
		}
	}

	@Override
	public String toString() {
		return "Node [leftNode=" + leftNode + ", value=" + value + ", rightNode=" + rightNode + "]";
	}

}
