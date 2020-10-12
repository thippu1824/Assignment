package com.itorizon.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * This class shows ArrayList programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class ArrayListPrograms {
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void addToArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);

		System.out.print("Enter name to add into the array list: ");
		String name = scanner.nextLine();
		al.add(name);
		System.out.println("Updated array list is:" + al);

		Iterator<String> itr = al.iterator();
		System.out.println("Printing array list using iterator:");
		while (itr.hasNext()) {
			String value = (String) itr.next();
			System.out.println(value);
		}
	}


	public void insertAtFirstPosition() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.print("Insert an element into the array list at the first position: ");
		String nameAtFirst = scanner.nextLine();
		al.add(0, nameAtFirst);
		System.out.println("Result after insertion: " + al);
	}
	 
	 
	public void enterIndexToShowName() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.print("Enter the index value to show the name: ");
		int index = scanner.nextInt();
		System.out.println("The name at " + index + " th index is: " + al.get(index));
	}
	
	public void updateArrayElement() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.println("Update specific array element by given element");
		System.out.print("Enter the index value you want to replace: ");
		int replaceIndex = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter new name you want to insert: ");
		String replaceName = scanner.nextLine();
		al.set(replaceIndex, replaceName);
		System.out.println("Result after replacing name in the array list: " + al );
	}
	
	
	public void removeThirdElement() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.println("Remove the third element from a array list");
		al.remove(3);
		System.out.println("Result after removing third element: " + al);
	}
	
	
	public void copyElementsToOtherArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.println("Create another array lsit");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rama");
		al2.add("Lakhsmana");
		al2.add("Bharatha");
		al2.add("Dasharatha");
		System.out.println("First array list values are: " + al);
		System.out.println("Second array list values are: " + al2);
		System.out.println("Copy names of second array list into first array list");
		Collections.copy(al, al2);
		System.out.println("Result after copying");
		System.out.println("First array list values are: " + al);
		System.out.println("Second array list values are: " + al2);
	}
	
	
	public void reverseJoinClone() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		Collections.reverse(al);
		System.out.println("Array list after Reversing the elements:" + al);
		System.out.println("Join two array lists");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Krishna");
		al3.add("Karna");
		al3.add("Arjuna");
		al3.add("Bheema");
		al3.add("Nakula");
		System.out.println("The names of  first array list are: " + al3);
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Rama");
		al4.add("Lakhsmana");
		al4.add("Bharatha");
		al4.add("Dasharatha");
		System.out.println("The names of  second array list are: " + al4);
		al3.addAll(al4);
		System.out.println("Result after joining " + al3);
		System.out.println("Clone an array list to another array list");
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Krishna");
		al5.add("Karna");
		al5.add("Arjuna");
		al5.add("Bheema");
		al5.add("Nakula");
		System.out.println("The names of  first array list are: " + al5);
		ArrayList<String> al6 = new ArrayList<String>();
		System.out.println("The names of second array list are: " +al6);
		al6 = (ArrayList<String>) al5.clone();
		System.err.println("The names of second array list after cloning: " +al6);
	}
	
	
	
	public void checkArrayEmptyOrNot() {
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("Krishna");
		al7.add("Karna");
		al7.add("Arjuna");
		al7.add("Bheema");
		al7.add("Nakula");
		System.out.println("The array list before emptying: " + al7);
		System.out.println("Check whether the array list is empty or not");
		boolean res = al7.isEmpty();
		if (res) {
			System.out.println("The array list is empty");
		} else {
			System.out.println("The array list is not empty");
		}
		System.out.println("Empty an array list.");

		al7.clear();
		System.out.println("The array list after emptying: " + al7);
		System.out.println("Check whether the array list is empty or not");
		boolean res1 = al7.isEmpty();
		if (res1) {
			System.out.println("The array list is empty");
		} else {
			System.out.println("The array list is not empty");
		}
	}
	
	
	public void searchAndSortArray() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Krishna");
		al.add("Karna");
		al.add("Arjuna");
		al.add("Bheema");
		al.add("Nakula");
		System.out.println("The names of  array list are: " + al);
		System.out.println("Array list elements are " + al);
		System.out.print("Search an element in a array list: ");
		String searchName = scanner.nextLine();
		Collections.sort(al);
		int result = Collections.binarySearch(al, searchName);
		if (result >= 0) {
			System.out.println(searchName + " is present in the array list");
		} else {
			System.out.println("Searching failed!!! The name you want to search is not present in the list");
		}
		
		System.out.println("Array list after sorting based on alphabetical order: " +al);
	}
	
	
	 
}
