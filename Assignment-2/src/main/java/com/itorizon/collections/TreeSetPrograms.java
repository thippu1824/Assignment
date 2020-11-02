package com.itorizon.collections;

import java.util.Iterator;
import java.util.TreeSet;
/**
 * 
 * @author Thippeswamy H
 * @version 1.0.0
 * 
 */
public class TreeSetPrograms {

	/*
	 * to create a new tree set, add some random numbers (Integer) and print out the
	 * tree set.
	 */
	public void createTreeSet() {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		// print the elements
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	// iterate over all the entries in the HashMap.
	public void iterateTreeSet(TreeSet<Integer> numbers) {
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// add all the elements of a specified tree set to another tree set.
	public static TreeSet<Integer> addToAnother(TreeSet<Integer> numbers) {
		TreeSet<Integer> newSet = new TreeSet<Integer>();
		newSet.addAll(numbers);
		return newSet;
	}

	// to get the first elements in a tree set.
	public static int getFirstElement(TreeSet<Integer> numbers) {
		return numbers.first();
	}

	// to get the last elements in a tree set.
	public static int getLastElement(TreeSet<Integer> numbers) {
		return numbers.last();
	}

	// get the number of elements in a tree set.
	public static int getSize(TreeSet<Integer> numbers) {
		return numbers.size();
	}

	// to find the numbers less than 7 in a tree set.
	public static TreeSet<Integer> getNumberLessThanSpecified(TreeSet<Integer> numbers) {
		TreeSet<Integer> newSet = new TreeSet<Integer>();
		newSet = (TreeSet<Integer>) numbers.headSet(7);
		return newSet;
	}

	/*
	 * to get the element in a tree set which is greater than or equal to the given
	 * element.
	 */
	public static int getClosestGreater(TreeSet<Integer> numbers, int number) {
		int closestGreater;
		closestGreater = numbers.ceiling(number);
		return closestGreater;
	}

	// retrieve and remove the first element of a tree set.
	public static int retriveFirst(TreeSet<Integer> numbers) {
		return numbers.pollFirst();

	}

	// retrieve and remove the last element of a tree set.
	public static int retriveLast(TreeSet<Integer> numbers) {
		return numbers.pollLast();

	}

	// to remove a given element from a tree set.
	public static boolean removeElement(TreeSet<Integer> numbers, int number) {
		return numbers.remove(number);
	}
}
