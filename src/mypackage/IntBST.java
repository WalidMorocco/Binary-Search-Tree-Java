package mypackage;

public class IntBST {
	
	protected IntBSTNode root;
	
	public IntBST() {
		root = null;
	}
	
	protected void visit(IntBSTNode p) {
		System.out.println(p.key + " ");
	}
	
	public void insert(int el) {
		IntBSTNode p = root;
		IntBSTNode prev = null;
		
		while (p != null) {
			prev = p;
			if (p.key < el) {
				p = p.right;
			}
			else {
				p = p.left;
			}
			
		}
		
		if (root == null) {
			root = new IntBSTNode(el);
		}
		else if (prev.key < el) {
			prev.right = new IntBSTNode(el);
		}
		else {
			prev.left = new IntBSTNode(el);
		}
	}
	
	public IntBSTNode search(IntBSTNode p, int el) {
		while (p != null) {
			if (el == p.key) {
				return p;
			}
			else if (p.key > el) {
				p = p.left;
			}
			else {
				p = p.right;
			}
		}
		return null;
	}
}
