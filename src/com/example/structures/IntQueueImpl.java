package com.example.structures;

import com.example.interfaces.IntQueue;
import com.example.objects.QueueNode;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class IntQueueImpl implements IntQueue {
	
	QueueNode firstNode;
	QueueNode lastNode;
	String name;
	
	public IntQueueImpl(){
		this("Queue");
	}
	
	public IntQueueImpl(String QueueName) {
		name = QueueName;
		firstNode = lastNode = null;
	}
	
	public boolean isEmpty() {
		return firstNode == null;
	}

	public void put(int item) {
		QueueNode node = new QueueNode( item );
		if ( isEmpty() )
		firstNode = lastNode = node;
		else {
			lastNode.setNext(node);
			lastNode = node;
		}
	}

	public int get() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException(name);
		}

		int removedItem = firstNode.getInt();

		if ( firstNode == lastNode ) {
			firstNode = lastNode = null;
		}
		else {
			firstNode = firstNode.getNext();
		}

		return removedItem;
	}

	public int peek() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException(name);
		}

		return firstNode.getInt();
	}

	public void printQueue(PrintStream stream) {
		if(isEmpty()) {
			System.out.printf("The %s is Empty.\n"+name);
		}
		
		stream.printf( "The %s is: ", name );
		QueueNode current = firstNode;
		
		while ( current != null )
		{
			stream.printf( "%s ", current.getInt() );
			current = current.getNext();
		}

		stream.println( "\n" );
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		}
		
		QueueNode current = firstNode;
		int i = 0;
		while ( current != null )
		{
			i++;
			current = current.getNext();
		}
		return i;
	}
	
}
