package com.itorizon.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 * @author Thippeswamy H
 * @version 1.0.0
 * 
 */
public class HashSetPrograms {

	/*
	 * to create a new Hash Set containing student names, add some student (string)
	 * and print out the collection.
	 */
	public HashSet<String> createHashSet() {
		HashSet<String> studentNames = new HashSet<String>();
		studentNames.add("Krishna");
		studentNames.add("Arjuna");
		studentNames.add("Bheema");
		studentNames.add("Rama");
		studentNames.add("Karna");

		// iterate through all elements in hash set
		Iterator<String> itr = studentNames.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return studentNames;
	}

	// append the specified element to the end of a hash set.
	public static HashSet<String> addElement(HashSet<String> studentNames, String name) {
		studentNames.add(name);
		return studentNames;

	}

	// get the number of elements in a hash set.
	public static int getSize(HashSet<String> studentNames) {
		return studentNames.size();
	}

	// to empty an hash set.
	public static HashSet<String> clearSet(HashSet<String> studentNames) {
		studentNames.clear();
		return studentNames;

	}

	// convert a hash set to an array.
	public static Object[] SetToArray(HashSet<String> studentNames) {
		Object[] arr = studentNames.toArray();
		return arr;
	}

	// convert a hash set to a List/ArrayList
	public static ArrayList<String> SetToList(HashSet<String> studentNames) {
		ArrayList<String> students = new ArrayList<String>(studentNames);
		return students;

	}

	// to compare two hash set.
	public static boolean compareHashSet(HashSet<String> studentNames, HashSet<String> hashSet) {
		return studentNames.equals(hashSet);

	}

	// to compare two sets and retain elements which are same on both sets.
	public static HashSet<String> getEqualElements(HashSet<String> studentNames, HashSet<String> newSet) {
		HashSet<String> commonSet = new HashSet<String>();
		for (String name : studentNames) {
			if (newSet.contains(name)) {
				commonSet.add(name);
			}
		}
		return commonSet;
	}
}
