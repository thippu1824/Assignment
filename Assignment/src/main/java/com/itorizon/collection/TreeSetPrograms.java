package com.itorizon.collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

/**
 * This class shows TreeSet programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class TreeSetPrograms {
	
	Scanner scanner = new Scanner(System.in);
	
	public void iterateTreeSet() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Iterate through all elements in a tree set");
		Iterator<Integer> iterator = ts.iterator();
		while (iterator.hasNext()) {
			int value = (int) iterator.next();
			System.out.println(value);
		}
	}
	
	
	public void addElement() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Add all the elements of a specified tree set to another tree set");
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2.add(2);
		ts2.add(4);
		ts2.add(9);
		System.out.println("The elements of 2nd tree set are: " + ts2);
		ts.addAll(ts2);
		System.out.println("The elemets of the first tre set after adding elemets; " + ts);
	}
	
	
	public void reverseCountGetFirstAndLastElement() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Reverse order view of the elements contained in a given tree set");
		Iterator<Integer> iterator = ts.descendingIterator();
		while (iterator.hasNext()) {
			int value = (int) iterator.next();
			System.out.println(value);
		}
		System.out.println("Get the first and last elements in a tree set");
		System.out.println("First element is: " + ts.first());
		System.out.println("Last element is: " + ts.last());
		System.out.println("get the number of elements in a tree set");
		int count = 0;
		for (int i = 0; i < ts.size(); i++) {
			count++ ;
		}
		System.out.println("The number of elements in tree set are: " +count);
	}
	
	
	
	public void numberLessThan7() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Find the numbers less than 7 in a tree set");
		Iterator<Integer> iterator = ts.iterator();
		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			if (value < 7) {
				System.out.println(value);
			}
		}
	}
	
	
	public void getSpecificElement() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Get the element in a tree set which is greater than or equal to the given element");
		System.out.print("Enter the element: ");
		int element = scanner.nextInt();
		Iterator<Integer> iterator = ts.iterator();
		System.out.print("The numbers which are greater than or equal to " + element + " are :");
		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			if (value >= element) {
				System.out.print( value + " ");
			}
		}
	}
	
	public void retreiveAndRemove() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Retrieve and remove the first element of a tree set");
		System.out.println("Before removing first element: " + ts);
		System.out.println("Retreiving ! ! ! " + ts.pollFirst());
		System.out.println("After removing first element: " + ts);
		System.out.println("Retrieve and remove the last element of a tree set");
		System.out.println("Before removing first element: " + ts);
		System.out.println("Retreiving ! ! ! " + ts.pollLast());
		System.out.println("After removing first element: " + ts);
	}
	
	
	
	public void removeParticularElement() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(18);
		ts.add(24);
		ts.add(3);
		System.out.println("The elements of tree set are: " + ts);
		System.out.println("Remove a given element from a tree set");
		System.out.print("Enter the elemet to remove from the tree set: ");
		int element = scanner.nextInt();
		ts.remove(element);
		System.out.println("Tree set after removing: " + ts);
	}
	

}
