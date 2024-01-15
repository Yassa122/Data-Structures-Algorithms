package Arrays;

import java.util.ArrayList;

public class LinearArrayListStudents {
	ArrayList<Student> students;
	int count = 0;

	public LinearArrayListStudents(int maxSize) {
		count = 0;
		students = new ArrayList<>();
	}

	public void insert(Student x) {
		students.add(x);
		count++;
	}

	public int LinearSearch(Student x) {
		for (int i = 0; i < count; i++) {
			if (students.get(i).id == x.id) {
				return i;
			}
		}
		return -1;
	}

	public void delete(Student x) {
		int pos = this.LinearSearch(x);
		if(pos==-1) {
			System.out.println("couldn't find the student");
		}else {
			students.remove(pos);
			count--;
		}
		
	}
	
	public void display() {
		for(int i=0;i<count;i++) {
			System.out.println(students.get(i)+" ");
		}
	}
}
