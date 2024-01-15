package Arrays;

public class Department {
	String name;
	Employee arr[];
	int count;

	public Department(int maxSize,String n) {
		count = 0;
		arr = new Employee[maxSize];
		name=n;
	}

	public void insert(Employee x) {
		if(count<arr.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==null) {
					x=arr[i];
				}else {
					System.out.println("Employee's list is full!");
				}
			}
			count++;

		}
	
	}
	public int linearSearch(int id) {
		for(int i=0;i<count;i++) {
			if(arr[i].id==id&&arr[i]!=null) {
				return i;
			}
		}
		return -1;
	}
	
	public void delete(int id) {
		int pos=this.linearSearch(id);
		
		if(pos==-1) {
			System.out.println("Can't find employee!");
		}else {
			arr[pos]=null;
			count--;
		}
	}
	public void display() {
		for(int i = 0;i<arr.length;i++) 
			if(arr[i]!=null) 
				System.out.print(arr[i]+" ");
			
			System.out.println();
		
	}
	public String toString() {
		return "name: "+ this.name;
				
	}
	
}