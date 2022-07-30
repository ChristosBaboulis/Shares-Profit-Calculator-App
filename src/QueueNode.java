
public class QueueNode {
	int data;
	QueueNode next;
	
	QueueNode(int num){
		this(num, null);
	}
	
	QueueNode(int num, QueueNode next){
		data = num;
		this.next = next;
	}
	
	int getInt() {
		return data;
	}
	
	QueueNode getNext() {
		return next;
	}
}
