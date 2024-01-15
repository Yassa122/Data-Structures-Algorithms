package practiceAssignments;

import java.util.ArrayList;

public class pa1 {

	// ex:1-1 insert in the last element

	Student []s;
	ArrayList<Student> arrs;
	int arr[];
	int count;

	public pa1(int maxSize) {
		count = 0;
		arr = new int[maxSize];
		arrs = new ArrayList<Student>();
		s=new Student[maxSize];
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
			for (int i = count; i > count; i--) {
				arr[i] = arr[i - 1];
				arr[0] = x;
				count++;
			}
		}
	}

	public int linearSearch1(int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			} else {
				System.out.println("elementt is not found");
			}
		}
		return -1;
	}

	public void delete(int x) {
		int pos = this.linearSearch1(x);
		if (pos == -1) {
			System.out.println("element is not found in the array");
		} else {
			for (int i = pos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
				count--;
			}
		}
	}

	// ex:1-2

	public void insert(Student x) {
		arrs.add(x);
		count++;
	}

	public int linearSearch2(Student x) {
		return arrs.indexOf(x);
	}

	public void delete(Student x) {
		int pos=this.linearSearch2(x);
		
		if(pos==-1) {
			System.out.println("can't find student");
		}else {
			arrs.remove(x);
			count--;
		}
	}

	
	//ex:1-3
	public void insertStudent(Student x) {
		if(count<s.length) {
			x=s[count++];
		}else {
			System.out.println("array is full");
		}
	}
	
	public int linearSearchStudent(Student x) {
		for(int i=0;i<s.length;i++) {
			if(s[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public void deleteStudent(Student x) {
		int pos=this.linearSearchStudent(x);
		if(pos==-1) {
			System.out.println("can't find student");
		}else {
			s[pos]=null;
			count--;
		}
	}
	
	
	
	//ex:1-4
	
	public void insertSorted(int x) {
		if(count<arr.length){
			int pos=0;
			while(pos<count&&arr[pos]<x) {
				for(int k = count; k > pos; k--)
					arr[k] = arr[k-1];
			}
			arr[pos]=x;
			count++;
		}
	}
	
	public int binarySearch(int x) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int pos=left+(right-left)/2;
			if(arr[pos]==x) {
				return pos;
			}else if(arr[pos]<x) {
				left=pos+1;
				
			}else {
				right=pos-1;
			}
		}
		return -1;
	}
	
	public  void deleteSorted(int x) {
		int pos=this.binarySearch(x);
		if(pos==-1) {
			System.out.println("can't find element");
		}else {
			for(int i = pos; i < count-1; i++)
				arr[i] = arr[i+1];
	
			count--;
		}		
	}
	
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
