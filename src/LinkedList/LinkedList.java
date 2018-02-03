package LinkedList;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements LinkedListInterface {
	Node start;
	Node next;

	// Iterator: INCOMPLETE
	@Override
	public Iterator<String> iterator() {
		return null;
	}

	// ToArray: INCOMPLETE
	@Override
	public Object[] toArray() {
		return null;
	}

	// ???
	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	// Add: INCOMPLETE
	@Override
	public boolean add(String e) {
		return false;
	}

	// ContainsAll: INCOMPLETE
	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	// AddAll: INCOMPLETE
	@Override
	public boolean addAll(Collection<? extends String> c) {
		return false;
	}

	// RemoveAll: INCOMPLETE
	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	// RetainAll: INCOMPLETE
	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	// Clear: INCOMPLETE
	@Override
	public void clear() {

	}

	// AddFirst: INCOMPLETE
	@Override
	public void addFirst(String data) {

	}

	// Remove: INCOMPLETE
	@Override
	public String remove(int index) throws IndexOutOfBoundsException {
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

	// Size: WORKS
	@Override
	public int size() {
		System.out.println("testing size");
		if (start == null) {
			System.out.println("Start is null");
			return 0;
		} else {
			Node s = start;
			System.out.println("Start exists");
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
		System.out.println("It's trying to work but failing");
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

	// Remove: WORKS
	@Override
	public boolean remove(Object o) {
		Node s = start;
		while (s != null) {
			if (s.getNext() == o) {
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
}