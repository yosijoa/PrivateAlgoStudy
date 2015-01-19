package gunlee.algo.struct.tree;

import org.junit.Test;

public class TestMain {
	
	public static void main(String[] args) {
		new TestMain().testAdd();
	}
	
	@Test
	public void testAdd() {
		BinarySearchTree btree = new BinarySearchTree();
		btree.put(100);
		btree.put(50);
		btree.put(200);;
		btree.put(30);
		btree.put(20);
		btree.put(10);
		btree.put(70);
		btree.put(250);
		btree.put(150);
		btree.put(230);
		btree.put(270);
		btree.inorderPrint();
		
		btree.delete(10);
		//btree.delete(20);
		btree.inorderPrint();
		
		
/*		System.out.println(btree.find(100)!=null);
		System.out.println(btree.find(200)!=null);
		System.out.println(btree.find(10)!=null);
		System.out.println(btree.find(70)!=null);
		System.out.println(btree.find(72)!=null);
*/		

			
	}
}
