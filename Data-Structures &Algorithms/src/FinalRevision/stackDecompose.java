package FinalRevision;

public class stackDecompose {
	public static ArrayStack decompose(ArrayStack x) {
		ArrayStack y = new ArrayStack(x.size());
		ArrayStack temp = new ArrayStack(x.size());

		while (!x.isEmpty()) {
				y.push(x.pop());
				temp.push(x.pop());
			
		}

		while(!y.isEmpty()) {
			x.push(y.pop());
		}
		
		while(!temp.isEmpty()) {
			y.push(temp.pop());
		}
		
		x.printStack();
		System.out.println("///");
		y.printStack();
		return y;

	}

	public static void main(String[] args) {
		ArrayStack x = new ArrayStack(8);

		x.push(6);
		x.push(9);
		x.push(3);
		x.push(5);
		x.push(4);
		x.push(1);
		x.push(2);
		x.push(7);

		x.printStack();

		System.out.println("///");

		decompose(x);
	}

}
