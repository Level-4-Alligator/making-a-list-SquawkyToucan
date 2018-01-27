package LinkedList;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements LinkedListInterface {
	Node start;
	Node next;
	@Override
	//Contains: WORKS
	public boolean contains(Object o) {
		while(start.getData() != o && start.getData() != null) {
			data = next;
		}
		if(data == null) {
			//Test failed
			return false;
		}
		else {
			//Test succeeded
			return true;
		}
	}
	//Iterator: INCOMPLETE
	@Override
	public Iterator<String> iterator() {	
		return null;
	}
	//ToString: INCOMPLETE
	@Override
	public String toString() {
		String din = "";
		while(data != null) {
			din = din + data;
			data = next;
		}
		System.out.println("It's trying to work but failing");
		return din;
	}
	//ToArray: INCOMPLETE
	@Override
	public Object[] toArray() {
		return null;
	}
	//???
	@Override
	public <T> T[] toArray(T[] a) {	
		return null;
	}
	//Add: INCOMPLETE
	@Override
	public boolean add(String e) {
		
		return false;
	}
	//Remove: INCOMPLETE
	@Override
	public boolean remove(Object o) {
		Node s = start;
		while(s.getData() != o && s.getData() != null) {
			//check reference
			s = s.getNext();
		}
		if(s.getData() == null) {
			//Test failed
			return false;
		}
		else {
			//Test succeeded
			return true;
		}
	}
	//ContainsAll: INCOMPLETE
	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}
	//AddAll: INCOMPLETE
	@Override
	public boolean addAll(Collection<? extends String> c) {
		return false;
	}
	//RemoveAll: INCOMPLETE
	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}
	//RetainAll: INCOMPLETE
	@Override
	public boolean retainAll(Collection<?> c) {	
		return false;
	}
	//Clear: INCOMPLETE
	@Override
	public void clear() {	
		
	}
	//IsEmpty: INCOMPLETE
	@Override
	public boolean isEmpty() {	
		return false;
	}
	//Size: INCOMPLETE
	@Override
	public int size() {	
		Node s = start;
		int i = 0;
		while(s.getData() != null) {
			//check reference
			s = s.getNext();
			i++;
		}
		return i;
	}
	//AddFirst: INCOMPLETE
	@Override
	public void addFirst(String data) {	
		
	}
	//AddLast: INCOMPLETE
	@Override
	public void addLast(String data) {	
		Node s = start;
		while(s.getNext() != null) {
			//check reference
			s = s.getNext();
		}
		//So now getData will be ok
		s.setData(data);
	}
	//Add: INCOMPLETE
	@Override
	public void add(String data, int index) throws IndexOutOfBoundsException {	
	}
	//Remove: INCOMPLETE
	@Override
	public String remove(int index) throws IndexOutOfBoundsException {	
		return null;
	}

}