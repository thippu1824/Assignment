package com.itorizon.collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import org.springframework.stereotype.Service;

/**
 * This class shows TreeMap programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class TreeMapPrograms {

	Scanner scanner = new Scanner(System.in);
	
	public void getAndDeleteAll() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Krishna");
		tm.put(8, "Arjuna");
		tm.put(6, "Bheema");
		tm.put(1, "Nakula");
		System.out.println("The elements in the tree map are: " + tm);
		System.out.println("Get all keys from the given a Tree Map");
		Set s1 = tm.keySet();
		System.out.println("The list of keys are: " + s1);
		System.out.println("Delete all elements from a given Tree Map");
		tm.clear();
		System.out.println("Tree set after deleting all the elemets: " + tm);
	}
	
	
	public void sortKeysInDescendingOrder() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Krishna");
		tm.put(8, "Arjuna");
		tm.put(6, "Bheema");
		tm.put(1, "Nakula");
		System.out.println("The elements in the tree map are: " + tm);
		System.out.println("Sort keys in descending order by using comparator");
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(new MyComparator());
		tm2.put(3, "Krishna");
		tm2.put(8, "Arjuna");
		tm2.put(6, "Bheema");
		tm2.put(1, "Nakula");
		System.out.println("Tree map in descending order: " + tm2);
	}
	
	
	public void getFirstAndLastKey() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Krishna");
		tm.put(8, "Arjuna");
		tm.put(6, "Bheema");
		tm.put(1, "Nakula");
		System.out.println("The elements in the tree map are: " + tm);
		System.out.println("get the first (lowest) key and the last (highest) key currently in a map");
		System.out.println("The lowest key is: " + tm.firstKey());
		System.out.println("The highest key is: " + tm.lastKey());
	}
	
	public void reverseTreeSet() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Krishna");
		tm.put(8, "Arjuna");
		tm.put(6, "Bheema");
		tm.put(1, "Nakula");
		System.out.println("The elements in the tree map are: " + tm);
		System.out.println("Get a reverse order view of the keys contained in a given map");
		System.out.println("Reverse order view of the keys: " + tm.descendingKeySet());
	}
	
	
}
