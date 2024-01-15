package priorityQueue;

import java.util.Date;

public class YoghurtProduct implements Comparable{
	private int ID;
	private double originalPrice;
	private Date date;

	public YoghurtProduct(int i, double o, Date d) {
		ID = i;
		originalPrice = o;
		date = d;
	}

	public String toString() {
		return "ID: " + this.ID + "Original price: " + this.originalPrice + "Date: " + this.date;
	}

	@Override
	public int compareTo(Object o) {
		YoghurtProduct y = (YoghurtProduct)o;
		return (date.compareTo(y.date));
	}
}
