package com.example.objects;

public class StackNode {
	private String data;
	private StackNode next;

	public StackNode(String nm){
		this(nm, null);
	}

	public StackNode(String nm, StackNode next){
		data = nm;
		this.next = next;
	}

	public String getString() {
		return data;
	}

	public StackNode getNext() {
		return next;
	}

	public void setNext(StackNode next) { this.next = next; }
}
