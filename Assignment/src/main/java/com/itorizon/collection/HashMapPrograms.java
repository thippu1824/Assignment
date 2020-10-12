package com.itorizon.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * This class shows HashMap programs in Collection topic
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class HashMapPrograms {

	Scanner scanner = new Scanner(System.in);
	
	public void addStudent() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Krishna");
		hashMap.put(2, "Arjuna");
		hashMap.put(3, "Karna");
		hashMap.put(4, "Nakula");
		System.out.println("Details of the student: " + hashMap);
		System.out.println("Add Student details");
		System.out.print("Enter Student id: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("enter student name: ");
		String name = scanner.nextLine();
		hashMap.put(id, name);
		System.out.println("Details of the student after adding:" + hashMap);
	}
	
	
	
	public void iterateHashMap() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Krishna");
		hashMap.put(2, "Arjuna");
		hashMap.put(3, "Karna");
		hashMap.put(4, "Nakula");
		System.out.println("Details of the student: " + hashMap);
		System.out.println("Iterate over all the entries in the HashMap");
		Set s1 = hashMap.entrySet();
		Iterator iterator = s1.iterator();
		while (iterator.hasNext()) {
			Map.Entry m1 = (Map.Entry) iterator.next();
			System.out.println(m1.getKey() + " : " + m1.getValue());
		}
	}
	
	
	
	public void getAndCountEntries() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Krishna");
		hm.put(2, "Arjuna");
		hm.put(3, "Karna");
		hm.put(4, "Nakula");
		System.out.println("Details of the student: " + hm);
		System.out.println("Get the specified value for the specified key in a HashMap");
		System.out.print("Enter Student Id: ");
		int id = scanner.nextInt();
		System.out.println("Student name is: " + hm.get(id));
		System.out.println("Number of Entries in a Hash map");
		int count = 0;
		for (int i = 0; i < hm.size(); i++) {
			count++ ;
		}
		System.out.println("Size of the hash map: " + count);
	}
	
	
	
	public void copyAndRemove() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Krishna");
		hm.put(2, "Arjuna");
		hm.put(3, "Karna");
		hm.put(4, "Nakula");
		System.out.println("Details of the student: " + hm);
		System.out.println("Copy all of the mappings from the specified map to another map");
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		System.out.println("Entries in 2nd Hashmap: " + hm2);
		hm2.putAll(hm);
		System.out.println("Entries in 2nd Hashmap: " + hm2);
		System.out.println("Remove all of the mappings from a map");
		hm.clear();
		System.out.println("Entries in map after removing all the elements: " + hm);
	}
	
	
	
	public void containsSpecificStudent() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Krishna");
		hm.put(2, "Arjuna");
		hm.put(3, "Karna");
		hm.put(4, "Nakula");
		System.out.println("Details of the student: " + hm);
		System.out.println("Test if a map contains a mapping for the specified Student id");
		System.out.print("Enter student id: ");
		int id = scanner.nextInt();
		boolean res = hm.containsKey(id);
		if (res) {
			System.out.println("Student id: " + id + " is present and the name of the student is :" +hm.get(id) );
		} else {
			System.out.println("Student id which you are searching is not present");
		}
		System.out.println("Test if a map contains a mapping for the specified Student name");
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		boolean res1 = hm.containsValue(name);
		if (res1) {
			System.out.println("Student name : " + name + " is present");
		} else {
			System.out.println("Student name which you are searching is not present");
		}
	}
	
	
	
	public void setAndCollectionView() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Krishna");
		hm.put(2, "Arjuna");
		hm.put(3, "Karna");
		hm.put(4, "Nakula");
		System.out.println("Details of the student: " + hm);
		System.out.println("Set view of the keys contained in this map");
		Set s1 = hm.keySet();
		System.out.println("The list of student Id's: " + s1);
		
		System.out.println("Collection view of the values contained in this map");
		Collection collection = hm.values();
		System.out.println("The list of student names: " + collection);
	}
	
	
	
	
}
