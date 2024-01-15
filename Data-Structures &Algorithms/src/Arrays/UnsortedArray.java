package Arrays;

public class UnsortedArray {
	int count;
	int arr[];

	public UnsortedArray(int maxSize) {
		count = 0;
		arr = new int[maxSize];

	}

	public void insertLast(int x) {
		if (count < arr.length) {
			arr[count++] = x;
		} else {
			System.out.println("array is full");
		}
	}

	public void insertFirst(int x) {
		if (count < arr.length) {
			for (int i = count; i > 0; i--) {
				arr[i] = arr[i - 1];
				arr[0] = x;
				count++;

			}
		}
	}

	public int LinearSearch(int x) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void delete(int x) {
		int pos = this.LinearSearch(x);
		if (pos == -1) {
			System.out.println("element is not found");
		} else {
			for (int i = pos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
				count--;
			}
		}
	}

	public void displayArray() {
		System.out.print("Array: ");
		for (int i = 0; i < count; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
