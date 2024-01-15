package leetCodeQuestions;


class Node {
int data;
Node next;
	
}
 
 class singleList {
	 Node first;
	 
	 public void minToFront() {
		 Node Current=first;
		 int count=0;
		 int min=0;
		 
		 while(Current.next!=null) {
			 Current=Current.next;
			 count++;
		 }
		 for(int i=0;i<count;i++) {
			 if(Current.data<min) {
				 min=Current.data;
			 }
		 }
		 min=first.data;
	 }
 }