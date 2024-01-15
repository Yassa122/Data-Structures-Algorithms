package FinalRevision;

public class diplaytree {
	
	public static void main(String[] args) {
		BTree b= new BTree();
		
		b.add(1);
		b.add(5);
		b.add(2);
		b.add(1);
		b.add(8);
		b.add(15);
		b.add(4);
		b.add(9);
		
		b.displayTree();
		
	}

}
