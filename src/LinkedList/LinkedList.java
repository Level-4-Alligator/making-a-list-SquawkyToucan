package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements LinkedListInterface {
	Node start;
	Node next;

	// Iterator: INCOMPLETE
	@Override
	public Iterator<String> iterator() {
		System.out.println("why did you call this method");
		return null;
	}

	// ???
	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}


	/**
	 * THESE METHODS ARE COMPLETED DO NOT SCREW THEM UP YOU WILL REGRET IT LATER SO
	 * DONT SCREW THEM UP
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	/**
	 * You are entering the land of completed methods
	 */
	/**
	 * THESE METHODS ARE COMPLETED DO NOT SCREW THEM UP YOU WILL REGRET IT LATER SO
	 * DONT SCREW THEM UP
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	// Clear: WORKS
	@Override
	public void clear() {
		start = null;
	}

	// RemoveAll: WORKS
	@Override
	public boolean removeAll(Collection<?> c) {
		Object[] sanity = c.toArray();
		for(int i = 0; i < c.size(); i++) {
			Object temp = sanity[i];
			remove(temp);
		}
		return true;
	}
	
	// Get: WORKS
	public Object get(int index) {
		Node n = start;
		for (int i = 0; i < index; i++) {
			n = n.getNext();
		}
		return n.getData();
	}

	// Remove: WORKS
	@Override
	public boolean remove(Object o) {
		Node s = start;
		Node f = new Node();
		while (s != null) {
			if (s.getNext() != null) {
				f = s.getNext();
			}
			if (f.getData() == o) {
				// Next is deleted, so skip
				Node b = s;
				b = s.getNext();
				s.setNext(b.getNext());
				return true;
			}
			s = s.getNext();
		}
		return false;
	}

	// Remove: WORKS (kind of, use the right one)
	@Override
	public String remove(int index) throws IndexOutOfBoundsException {
		remove(get(index));
		return null;
	}
	
	// RetainAll: WORKS
	@Override
	public boolean retainAll(Collection<?> c) {
		//Removes all elements NOT in the collection
		for(int i = 0; i < size(); i++) {
			if(!c.contains(get(i))) {
				remove(get(i));
			}
		}
		return true;
	}

	// ContainsAll: WORKS
	@Override
	public boolean containsAll(Collection<?> c) {
		//Loop through items in collection, run contains() on each. If it fails the entire test fails bye
		Object[] sanity = c.toArray();
		for(int i = 0; i < c.size(); i++) {
			String temp = sanity[i].toString();
			if(!contains(temp)) {
				return false;
			}
		}
		return true;
	}
	
	// Add: WORKS
	@Override
	public void add(String data, int index) throws IndexOutOfBoundsException {
		// For loop to go through up to index
		// Set next for previous to data
		// Set data next to next
		Node s = start;
		for (int i = 0; i < index - 1; i++) {
			s = start.getNext();
		}
		// Now at the one before where we add
		Node savedToMove = s.getNext();
		Node d = new Node();
		d.setData(data);
		s.setNext(d);
		d.setNext(savedToMove);
	}

	// AddAll: WORKS
	@Override
	public boolean addAll(Collection<? extends String> c) {
		Object[] sanity = c.toArray();
		for(int i = 0; i < c.size(); i++) {
			String temp = sanity[i].toString();
			addLast(temp);
		}
		return true;
	}

	// AddFirst: WORKS
	@Override
	public void addFirst(String data) {
		Node neue = new Node();
		neue.setData(data);
		neue.setNext(start);
		start = neue;
	}

	// AddLast: WORKS
	@Override
	public void addLast(String data) {
		Node s = start;
		Node n = new Node();
		n.setData(data);
		if (start == null) {
			start = new Node();
			start.setData(data);
		} else {
			while (s.getNext() != null) {
				// check reference
				s = s.getNext();
			}
			// So now getData will be ok
			s.setNext(n);
		}
	}
	
	// ToArray: WORKS
	@Override
	public Object[] toArray() {
		Object[] j = new Object[size()];
		for(int i = 0; i < j.length; i++) {
			j[i] = get(i);
		}
		return j;
	}

	// Size: WORKS
	@Override
	public int size() {
		if (start == null) {
			return 0;
		} else {
			Node s = start;
			int i = 0;
			while (s != null) {
				// check reference
				s = s.getNext();
				i++;
			}
			return i;
		}
	}

	// IsEmpty: WORKS
	@Override
	public boolean isEmpty() {
		Node s = start;
		// See if it's equal to null
		if (s == null) {
			return true;
		} else {
			return false;
		}
	}

	// ToString: WORKS
	@Override
	public String toString() {
		String din = "";
		Node s = start;
		while (s != null) {
			if (s.getNext() != null) {
				din = din + (String) s.getData() + " ";
			} else {
				din = din + (String) s.getData();
			}
			s = s.getNext();
		}
		return din;
	}

	@Override
	// Contains: WORKS
	public boolean contains(Object o) {
		Node s = start;
		while (s != null) {
			if (s.getData() == o) {
				return true;
			}
			s = s.getNext();
		}
		return false;
	}

	@Override
	public boolean add(String e) {
		// Just does addLast
		Node s = start;
		Node n = new Node();
		n.setData(e);
		if (start == null) {
			start = new Node();
			start.setData(e);
		} else {
			while (s.getNext() != null) {
				// check reference
				s = s.getNext();
			}
			// So now getData will be ok
			s.setNext(n);
		}
		return true;
	}
}