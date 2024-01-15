package Arrays;

public class Book {
	String title;
	String Author;
	int ISBN;
	int year;
	
	public Book(String t,String a,int i,int y) {
		title=t;
		Author=a;
		ISBN=i;
		year=y;
	}

	public int getISBN() {
		// TODO Auto-generated method stub
		return ISBN;
	}
}
