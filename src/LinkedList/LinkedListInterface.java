package LinkedList;

import java.util.Collection;

public interface LinkedListInterface extends Collection<String> {

	/**
	 * Check if list is empty
	 * 
	 * @return true if the list is empty
	 */
	public boolean isEmpty();

	/**
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	public int size();

	/**
	 * Insert an element at beginning of the list
	 * 
	 * @param data
	 *            - data to be inserted
	 */
	public void addFirst(String data);

	/* Function to insert an element at end */

	/**
	 * Insert an element at the end of the list
	 * 
	 * @param data
	 *            - data to be inserted
	 */
	public void addLast(String data);

	/**
	 * Adds the specified element to the specified position in this list.
	 *
	 * @param data
	 *            object to be appended to this list
	 * @param index
	 *            - the position to insert the data
	 * @return {@code true} (as specified by {@link Collection#add})
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	public void add(String data, int index) throws IndexOutOfBoundsException;

	/**
	 * Removes the element at the specified position in this list. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 * Returns the element that was removed from the list.
	 *
	 * @param index
	 *            the index of the element to be removed
	 * @return the element previously at the specified position
	 * 
	 * @throws IndexOutOfBoundsException
	 *             {@inheritDoc}
	 */
	public String remove(int index) throws IndexOutOfBoundsException;

	/**
	 * @return a string representation of the list
	 */
	public String toString();

}
