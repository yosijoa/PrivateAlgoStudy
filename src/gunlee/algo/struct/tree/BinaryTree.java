package gunlee.algo.struct.tree;

public class BinaryTree {
	Node root;
	
	public BinaryTree() {}
	
	public BinaryTree(Node node) {
		this.root = node;
	}
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public void preorderPrint(Node node) {
		if(node == null) {
			return;
		}
		System.out.print("..");
		System.out.print(node.getData());
		preorderPrint(node.getLeft());
		preorderPrint(node.getRight());
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
	
	public void postorderPrint(Node node) {
		if(node == null) {
			return;
		}
		postorderPrint(node.getLeft());
		postorderPrint(node.getRight());
		System.out.print("..");
		System.out.print(node.getData());
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setLeft(f);
		c.setRight(g);
		d.setLeft(h);
		d.setRight(i);
		
		BinaryTree btree = new BinaryTree(a);
		btree.preorderPrint(a);System.out.println();
		btree.inorderPrint(a);System.out.println();
		btree.postorderPrint(a);
	}
}
