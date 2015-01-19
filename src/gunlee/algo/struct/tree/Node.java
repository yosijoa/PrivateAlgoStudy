package gunlee.algo.struct.tree;

public class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}
	
	public void setLeft(Node node) {
		this.left = node;
	}
	
	public void setRight(Node node) {
		this.right = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

}
