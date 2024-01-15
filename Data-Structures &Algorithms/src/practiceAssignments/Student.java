package practiceAssignments;

public class Student {

	String firstName;
	String lastName;
	int id;
	
	public Student(String f,String l,int i) {
		firstName=f;
		lastName=l;
		id=i;
	}
	public String toString() {
		return "first name: "+firstName+"last name: "+lastName+"id: "+id;
	}
}
