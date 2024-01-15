package Arrays;

public class Students {
	String name;
	int id;
	double gpa;
	
	public Students(String n,int i, double g) {
		name=n;
		id=i;
		gpa=g;
		
	}

	public String toString(){
		return "ID: " + id + "name: "+name + "GPA: "+gpa;
	}
	
	public static void sortByName(Students[]s) {
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j]==null||s[j]==null) {
					break;
				}else {
					if(s[j].name.compareToIgnoreCase(s[j+1].name)>0) {
						Students tmp=s[i];
						s[i]=s[i+1];
						s[i+1]=tmp;
					}
				}
			}
		}
	}
}
