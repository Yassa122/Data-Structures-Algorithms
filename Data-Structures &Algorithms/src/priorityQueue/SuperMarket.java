package priorityQueue;

public class SuperMarket {

	PriorityQueue pq;

	public SuperMarket(int maxProdNum) {
		pq = new PriorityQueue(maxProdNum);
	}
	public void addProd(YoghurtProduct y) {
		if (!pq.isFull())
			pq.insert(y);
			else
			System.out.println ("Cannot add the new Product");
	}
	
	


}
