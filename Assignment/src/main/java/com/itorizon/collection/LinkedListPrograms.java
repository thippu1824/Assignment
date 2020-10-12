package com.itorizon.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * This class shows LinkedList programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class LinkedListPrograms {

	Scanner scanner = new Scanner(System.in);

	public void addToEndOfList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.print("Enter the specified element to the end of a linked list: ");
		String endName = scanner.nextLine();
		ll.addLast(endName);
		System.out.println("The names of linked lists after appending: " + ll);
	}



	public void iterateList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Iterate through all elements in a linked list");
		Iterator< String> itr = ll.listIterator();
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
		}
		System.out.println("Iterate a linked list in reverse order");
		for (int i = ll.size() - 1; i >= 0; i--) {
			System.out.println(ll.get(i));
		}
		System.out.println("Iterate through all elements in a linked list starting at the specified position");
		System.out.print("Enter the index value from which you want start iteration: ");
		int index = scanner.nextInt();
		for(ListIterator<String> iter = ll.listIterator(index);iter.hasNext();) {
			String value = (String)iter.next();
			System.out.println(value);
		}
	}


	public void inserAtSpecifiedPlace() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Insert the specified element at the specified position in the linked list");
		System.out.print("Enter the specified position: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the name you want insert: ");
		String name = scanner.nextLine();
		ll.add(index, name);
		System.out.println("Result after adding name: " + ll);
	}


	public void insertAtFrontAndEnd() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.print("Insert the specified element at the front of a linked list: ");
		String name = scanner.nextLine();
		ll.addFirst(name);
		System.out.println("Result after adding name at the beginning: " + ll);
		System.out.print("Insert the specified element at the end of a linked list: ");
		String name1 = scanner.nextLine();
		ll.addLast(name1);
		System.out.println("Result after adding name at the end: " + ll);
	}



	public void displayAndRemove() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Display the elements and their positions in a linked list:");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " is present at " + i + " position");
		}
		System.out.println("Remove first and last element from a linked list");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The names of linked lists after removing first and last elements:" + ll);
		System.out.println("Remove all the elements from a linked list");
		ll.clear();
		System.out.println("Result after removing :" + ll);
	}


	public void joinTwoLinkedList() {
		System.out.println("Join two linked lists");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked list1 are: " + ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("rama");
		ll2.add("bharatha");
		ll2.add("lakshmana");
		ll2.add("dasharatha");
		ll2.add("sumitra");
		System.out.println("The names of linked list2 are: " + ll2);
		ll.addAll(ll2);
		System.out.println("Result after joining: " + ll);
	}
	
	
	
	public void cloneList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Clone an linked list to another linked list");
		LinkedList<String> ll2 = new LinkedList<String>();
		System.out.println("Elements in new linked list are: " + ll2);
		ll2 = (LinkedList<String>) ll.clone();
		System.out.println("Result after cloning "+ ll2);
	}
	
	
	public void removeAndRetreive() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Remove and return the first element of a linked list");
		System.out.println("Removing ! ! ! " + ll.removeFirst());
		System.out.println("Result after removing: " + ll);
		System.out.println("Retrieve but does not remove, the first element of a linked list");
		System.out.println("Retreiving ! ! ! " + ll.getFirst());
		System.out.println("Result after retreiving: " + ll);
	}
	
	
	
	public void checkElementExistance() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Check if a particular element exists in a linked list");
		System.out.print("Enter the element you want to check: ");
		String name =scanner.nextLine();
		if (ll.contains(name)) {
			System.out.println(name + " is present in the list");
		} else {
			System.out.println(name + " is not present in the list");
		}
	}
	
	
	public void ConvertToArrayList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Krishna");
		ll.add("Arjuna");
		ll.add("Karna");
		ll.add("Bheeshma");
		ll.add("Bheema");
		System.out.println("The names of linked lists are: " + ll);
		System.out.println("Convert a linked list to array list");
		ArrayList<String> al = new ArrayList<String>(ll);
		System.out.println( "The names of array list are: "  + al);
	}
	
	
	

}
