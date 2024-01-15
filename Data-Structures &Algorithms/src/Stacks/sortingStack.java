package Stacks;

public class sortingStack {
	
	public static void sort(ArrayStack s) {
		int count=s.size();
		ArrayStack s2 = new ArrayStack(count);
		int tmp;
			
		while(count>0) {
			int min=s.pop();
			for(int i=1;i<count;i++) {
				tmp = s.pop();
				if (tmp<min) {

					s2.push(min);
					min = tmp;

				}
			}
		}
	
	}

}
