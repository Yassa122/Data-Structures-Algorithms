package Arrays;

public class Company {
	Department arr[];
	int count;

	public Company(int maxSize) {
		count = 0;
		arr = new Department[maxSize];

	}

	public void insert(Department x) {
        if (count < arr.length) {
            arr[count] = x;
            count++;
        } else {
            System.out.println("List is full!");
        }
    }

	public int linearSearch(String name) {
		for (int i = 0; i < count; i++) {
            if (arr[i] != null && arr[i].name.equals(name)) { // Use equals for string comparison
				return i;
			}
		}
		return -1;
	}

	public void delete(String x) {
		int pos = this.linearSearch(x);
		if (pos == -1) {
			System.out.println("Can't find!");
		} else {
			arr[pos] = null;
			count--;
		}
	}

	public void display() {
		for (int i = 0; i < count; i++) 
			if (arr[i] != null) 
				System.out.print(arr[i].name + " ");
			System.out.println();
		
	}
	

	public static void main(String[] args) {
        Company a = new Company(5);
        Department d = new Department(10, "CS-Depart");
        a.insert(new Department(10, "Math"));
        a.insert(d); // Don't forget to insert CS-Depart as well
        d.insert(new Employee("Slim", "Abdelnahdder", 1));
        d.display();
        a.display(); // Display the departments in the company
    }
}
