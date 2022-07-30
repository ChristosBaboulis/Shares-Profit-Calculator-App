
public class StackNode {
	String data;
	StackNode next;
	
	StackNode(String nm){
		this(nm, null);
	}
	
	StackNode(String nm, StackNode next){
		data = nm;
		this.next = next;
	}
	
	String getString() {
		return data;
	}
	
	StackNode getNext() {
		return next;
	}
}
