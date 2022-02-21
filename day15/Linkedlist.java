package day15;

import java.util.*;

public class Linkedlist {

	Node firstNode;
	int count;

	// clear
	public Linkedlist() {
		firstNode = null;
		count = 0;
	}

	public Linkedlist(Node newhead) {
		firstNode = newhead;
		count = 0;
	}

	// add node
	public void add(int newEntry) {
		Node newNode = new Node(newEntry);

		if (count == 0) {
			// add the first node
			firstNode = newNode;
		} else {
			// traverse the linked list and add new node to end of nonempty list
			Node currentNode = firstNode;
			// while have not reached the last node
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			// make last node reference new node
			currentNode.setNext(newNode);
		}
		// increase count
		count++;
	}

	// get specific node
	public int get(int position) {
		Node currentNode = firstNode;

		if (position <= 0) {
			return -1;
		} else {
			for (int i = 1; i < position; i++) {
				currentNode = currentNode.getNext();
			}
		}
		return currentNode.getData();
	}
	
	// size
	public int numOfEntries() {
		return count;
	}
	
	// isEmpty
	public boolean isEmpty() {
	    return count == 0;
	}
	
	//remove from the back of the list
	public void remove() {
		Node currentNode = firstNode;
		
		while(currentNode.getNext().getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		count--;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist linkedlist = new Linkedlist();
		Scanner scan = new Scanner(System.in);
		int numOfElements = scan.nextInt();
		int data;
		for (int i = 1; i <= numOfElements; i++) {
			data = scan.nextInt();
			linkedlist.add(data);			
		}
		
		for (int i = 1; i <= numOfElements; i++) {
			 System.out.print(linkedlist.get(i) + " ");		
		}	
		
		
	}

}

class Node {
	Node next; // reference
	int data;

	// first Node
	public Node(int newEntry) {
		data = newEntry;
		next = null;
	}

	public Node(int newEntry, Node nextNode) {
		data = newEntry;
		next = nextNode;
	}

	// getters and setters
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
