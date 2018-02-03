package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	public void testLength() {
		LinkedListInterface tester = new LinkedList();
		assertEquals(0, tester.size());
		tester.addLast("15.600");
		assertEquals(1, tester.size());
		tester.addLast("15.333");
		tester.addLast("15.100");
		assertEquals(3, tester.size());
	}

	@Test
	public void testContains() {
		LinkedListInterface e = new LinkedList();
		e.addLast("MELKINOVA Angelina");
		assertTrue(e.contains("MELKINOVA Angelina"));
		assertFalse(e.contains("PASEKA Maria"));
		e.addLast("TUTKHALIAN Seda");
		assertFalse(e.contains("TUTKHALYAN Seda"));
	}

	@Test
	public void testRemove() {
		LinkedListInterface e = new LinkedList();
		e.addLast("IZBASA Sandra Raluca");
		e.addLast("PAVLOVA Anna");
		e.addLast("FEI Cheng");
		e.addLast("JOHNSON Shawn");
		e.addLast("DOS SANTOS Daiane");
		e.addLast("KRAKAMENKO idk");
		e.addLast("JIANG Yuyuan");
		e.addLast("LIUKIN Anastasia");
		e.addLast("chinese hope for medaling in floor final");
		e.remove("FEI Cheng");
		e.remove("SANTOS Daiane");
		e.remove("LIUKIN Anastasia");
		e.remove("PAVLOVA Anna");
		e.remove("chinese hope for medaling in floor final");
	}
	// Add more tests ...

}
