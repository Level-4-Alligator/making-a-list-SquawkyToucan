package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

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
		System.out.println(e.toString());
	}

	@Test
	public void testClear() {
		LinkedListInterface e = new LinkedList();
		e.addLast("niriri");
		e.addLast("a niriri");
		e.addLast("tongil mujigae");
		System.out.println(e.toString());
		e.clear();
		System.out.println(e.toString());
	}

	// Add more tests ...
	@Test
	public void testAddFirst() {
		LinkedListInterface e = new LinkedList();
		e.addLast("JOHNSON Shawn");
		e.addLast("LIUKIN Anastasia");
		e.addLast("JIANG Yuyuan");
		e.addFirst("IZBASA Sandra Raluca");
		assertEquals(e.get(0), "IZBASA Sandra Raluca");
		assertEquals(e.get(1), "JOHNSON Shawn");
		e.addFirst("RAISMAN Alexandra");
		assertEquals(e.get(0), "RAISMAN Alexandra");
		assertEquals(e.get(2), "JOHNSON Shawn");
	}
	
	@Test
	public void toArrayTest() {
		System.out.println("Starting array test");
		LinkedListInterface y = new LinkedList();
		y.addLast("github");
		y.addLast("eclipse");
		y.addLast("cycling is dangerous because people dont know how to drive");
		Object[] z = y.toArray();
		System.out.println(z.toString());
		assertEquals(3, z.length);
		assertEquals(z[1], "eclipse");
		assertEquals(z[2], "cycling is dangerous because people dont know how to drive");
	}
	
	@Test
	public void containsAllAndAddAllAndRemoveAllTest() {
		System.out.println("Starting containsAll test");
		LinkedListInterface e = new LinkedList();
		Collection<String> cancerousItems = new ArrayList<String>();
		cancerousItems.add("I");
		cancerousItems.add("do not");
		cancerousItems.add("feel");
		cancerousItems.add("this is");
		cancerousItems.add("necessary");
		e.addLast("I");
		e.addLast("do not");
		e.addLast("feel");
		e.addLast("this is");
		e.addLast("necessary");
		assertTrue(e.containsAll(cancerousItems));
		e.remove("feel");
		assertFalse(e.containsAll(cancerousItems));
		e.clear();
		assertFalse(e.contains("I"));
		assertFalse(e.contains("this is"));
		e.addAll(cancerousItems);
		assertTrue(e.containsAll(cancerousItems));
		e.removeAll(cancerousItems);
		assertFalse(e.contains("feel"));
		System.out.println("The list: " + e.toString());
	}
}
