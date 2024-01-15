package Arrays;

public class ArrayUtility {
	int arr[];
	int count;

	public ArrayUtility(int maxSize) {
		count = 0;
		arr = new int[maxSize];
	}

	public void addNumber(int x) {
		if (count < arr.length) {
			for(int i=0;i<arr.length;i++) {
				x=arr[i];
			}
		}

	}
}
