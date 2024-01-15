package Arrays;

public class LinearArrayStudents {
	int count;
	Student arr[];

	public LinearArrayStudents(int maxSize) {
		count = 0;
		arr = new Student[maxSize];
	}

	public void insert(Student x) {
		if (count < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) {
					arr[i] = x;
					break;
				}

			}
			count++;

		} else {
			System.out.println("Array is full");
		}
	}

	public int LinearSearch(Student x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].id == x.id) {// order is crucial and must use && not just &
				return i;
			}

		}
		return -1;

	}

	public void delete(Student x) {

		int pos = this.LinearSearch(x);
		if (pos == -1) {
			System.out.println("Student not found");
		} else {
			arr[pos] = null;
			count--;
		}
	}

	public void display() {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != null)
				System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		LinearArrayStudents a = new LinearArrayStudents(5);
		a.insert(new Student("Yassa", "Ashraf", 7000313));
		a.insert(new Student("fady", "ibra", 8000295));
		a.insert(new Student("george", "youssef", 7002689));
		a.insert(new Student("Marco", "maher", 7000317));
		a.display();
//		a.delete(new Student("fady", "ibra", 8000295));
//		a.display();

	}
}
