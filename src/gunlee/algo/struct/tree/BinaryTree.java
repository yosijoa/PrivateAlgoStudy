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
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		Node i = new Node("i");
		
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
