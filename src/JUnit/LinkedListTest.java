package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import LinkedList.LinkedList;
import LinkedList.LinkedListInterface;

public class LinkedListTest {

	@Test
	public void testNewLinkedList() {
		LinkedListInterface singly = new LinkedList();
		assertTrue(singly.isEmpty()); // linked list should be empty
		assertEquals(0, singly.size()); // length of linked list should be 0
	}
	
	@Test
	public void testLinkedListAddLast() {
		LinkedListInterface singly = new LinkedList();
		singly.addLast("ABC");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(1, singly.size()); // length of linked list should be 1
	}

	@Test
	public void testLinkedListAddLastMultiple() {
		LinkedListInterface singly = new LinkedList();
		singly.addLast("You");
		singly.addLast("are");
		singly.addLast("awesome!!");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(3, singly.size()); // length of linked list should be 3
	}
	
	@Test
	public void testLinkedToString() {
		LinkedListInterface singly = new LinkedList();
		singly.addLast("You");
		singly.addLast("are");
		singly.addLast("awesome!!");
		assertEquals("You are awesome!!", singly.toString()); 
	}
	
	@Test
	public void testLinkedListAdd() {
		LinkedListInterface singly = new LinkedList();
		singly.addLast("You");
		singly.addLast("awesome!!");
		singly.add("are", 1);
		assertEquals("You are awesome!!", singly.toString()); 
	}
	
	@Test
	public void testContains() {
		LinkedListInterface e = new LinkedList();
		
	}
	// Add more tests ...

}
