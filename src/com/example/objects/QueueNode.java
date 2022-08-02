package com.example.objects;
public class QueueNode {
	private int data;
	private QueueNode next;
	
	public QueueNode(int num){
		this(num, null);
	}

	public QueueNode(int num, QueueNode next){
		data = num;
		this.next = next;
	}

	public int getInt() {
		return data;
	}

	public QueueNode getNext() {
		return next;
	}

	public void setNext(QueueNode next) { this.next = next; }
}
