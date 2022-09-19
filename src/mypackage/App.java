package mypackage;

public class App {

	public static void main(String[] args) {

		IntBST mytree = new IntBST();
		
		mytree.insert(13);
		mytree.insert(10);
		mytree.insert(2);
		mytree.insert(12);
		mytree.insert(25);
		mytree.insert(20);
		mytree.insert(31);
		mytree.insert(29);
		
//		System.out.println(mytree.search(mytree.root, 12).key);
		
//		mytree.breadthFirst();
		
		System.out.println("Tree's inorder before deleting node 31.");
		mytree.inorder(mytree.root);
		mytree.deleteByMerging(31);
		System.out.println("\nTree's inorder after deleting node 31.");
		mytree.inorder(mytree.root);
	}

}
