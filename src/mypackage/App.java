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
		
		mytree.inorder(mytree.root);
		
//		mytree.breadthFirst();
		
//		System.out.println(mytree.search(mytree.root, 12).key);
	}

}
