package Arrays;

public class Employee {
	String firstName;
	String lastName;
	int id;
	
	public Employee(String f,String l,int id) {
		firstName=f;
		lastName=l;
		this.id=id;
	}
	public String toString() {
		return "First name: "+firstName+'\n'+
				"last name: "+lastName+'\n'+
				"ID: "+this.id;
	}
}
