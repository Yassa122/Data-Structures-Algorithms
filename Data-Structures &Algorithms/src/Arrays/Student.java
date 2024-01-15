package Arrays;

public class Student {
	String firstName;
	String lastName;
	int id;

	public Student(String f, String l, int id) {
		firstName = f;
		lastName = l;
		this.id = id;
	}

	public String toString() {
		return firstName + " " + lastName + ", ID: " + id;
	}
}
