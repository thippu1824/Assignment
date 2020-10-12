package com.itorizon.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * This class shows HashSet programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class HashSetPrograms {
	Scanner scanner = new Scanner(System.in);
	
	public void addName() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.print("Add student names in a hash set: ");
		String name = scanner.nextLine();
		hs.add(name);
		System.out.println("Result after adding name: " + hs);
	}
	
	
	public void iterateHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.print("Add student names in a hash set: ");
		String name = scanner.nextLine();
		hs.add(name);
		System.out.println("Result after adding name: " + hs);
	}
	
	
	public void countAndEmptyHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Get the number of elements in a hash set");
		int count = 0;
		for (int i = 0; i < hs.size(); i++) {
			count++;
		}
		System.out.println("The number of elements in the hash set are: " + count);
		System.out.println("Empty an hash set");
		hs.clear();
		System.out.println("Result after emptying: " + hs);
	}
	
	
	public void convertToArrayList() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Convert a hash set to a List/ArrayList");
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println("The names of array list are: " + al);
	}
	
	
	public void compare() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Compare two hash sets");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Krishna");
		hs2.add("Arjuna");
		hs2.add("rama");
		System.out.println("The names of hash set 2 are: " + hs2);
		boolean result = hs.containsAll(hs2);
		if (result) {
			System.out.println("Two hash sets are same ");
		} else {
			System.out.println("Two hash sets are not same ");
		}
	}
	
	
	public void compareAndRetain() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Compare two sets and retain elements which are same on both sets");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Krishna");
		hs2.add("Arjuna");
		hs2.add("rama");
		System.out.println("The names of the 2nd hash sets are: " +hs2);
		hs.retainAll(hs2);
		System.out.println("names common to both hash set are: " + hs);
	}
	
	
	public void removeAllElements() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Krishna");
		hs.add("Arjuna");
		hs.add("Karna");
		System.out.println("The names of hash set are: " + hs);
		System.out.println("Remove all of the elements from a hash set");
		hs.clear();
		System.out.println("Result after removing all elemets from hash set is; " + hs);
	}
	
	
	
	
}
