package LinkedList;

import java.util.Collection;
import java.util.Iterator;

/*
 *  Java Program to Implement Singly Linked List
 */

/**
 * Class Node
 */
class Node {
	protected Object data;
	protected Node next;

	/**
	 * Constructor
	 */
	public Node() {
		next = null;
		data = 0;
	}

	/**
	 * Constructor
	 */
	public Node(Object d, Node n) {
		data = d;
		next = n;
	}

	/**
	 * Sets next link to reference node
	 * 
	 * @param node
	 *            a reference to the node
	 */
	public void setNext(Node node) {
		next = node;
	}

	/**
	 * Sets the data of the node
	 * 
	 * @param data
	 *            a reference to the data
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * Gets the node that the next link references
	 * 
	 * @return a reference to the next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Gets the data of the node
	 * 
	 * @return a reference to the data
	 */
	public Object getData() {
		return data;
	}
}