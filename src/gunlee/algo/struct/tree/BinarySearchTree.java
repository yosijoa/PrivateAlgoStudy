package gunlee.algo.struct.tree;

public class BinarySearchTree {
	Node root = null;
	
	public BinarySearchTree() {
	}
	
	public BinarySearchTree(int value) {
		
		this.root = new Node(value);
	}
	
	public void inorderPrint() {
		inorderPrint(root);
		System.out.println();
	}
	public void inorderPrint(Node node) {
		if(node == null) {
			return;
		}
		inorderPrint(node.getLeft());
		System.out.print("..");
		System.out.print(node.getData());
		inorderPrint(node.getRight());
	}
	
	public void put(int value) {
		if(this.root == null) {
			this.root = new Node(value);
			return;
		}
		put(root, value);
	}
	
	public void put(Node node, int value) {
		Node child = null;
		if(node.getData() < value) {
			if(node.getRight() == null) {
				node.setRight(new Node(value));
				return;
			}
			child = node.getRight();
		} else if (node.getData() > value) {
			if(node.getLeft() == null) {
				node.setLeft(new Node(value));
				return;
			}
			child = node.getLeft();
		}
		
		put(child, value);
	}
	
	public Node find(int value) {
		return find(root, value);
	}
	
	public Node find(Node node, int value) {
		if(node.getData() == value) return node;
		Node child;
		if(value > node.getData()) {
			child = node.getRight();
		} else {
			child = node.getLeft();
		}
		if(child != null) {
			return find(child, value);
		}
		
		return null;
	}
	
	public int getMinValue(Node node) {
		if(node.getLeft() == null) {
			return node.getData();
		}
		return getMinValue(node.getLeft());
	}
	
	public Node delete(int findValue) {
		return delete(root, findValue);
	}
	
	public Node delete(Node node, int findValue) {
		if(node == null) return null;
		
		Node left = node.getLeft();
		Node right = node.getRight();
		int value = node.getData();
		
		if(findValue > value) {
			node.setRight(delete(right, findValue));
			return node;
		} else if(findValue < value) {
			node.setLeft(delete(left, findValue));
			return node;
		} else {
			//then findValue = value
			if(left == null && right != null) {
				return right;
			} else if(right == null && left != null) {
				return left;
			} else if(left == null && right == null) {
				return null;
			} else { //then this node have both nodes.
				int min = getMinValue(right);
				node.data = min;
				node.setRight(delete(right, min));
				return node;
			}
		}
	}
}














