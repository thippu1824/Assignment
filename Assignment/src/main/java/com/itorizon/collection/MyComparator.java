package com.itorizon.collection;

import java.util.Comparator;

/**
 * This class is used for customized sorting order for TreeMap
 * @author Thippeswamy H
 * @version 1.0.0
 */
public class MyComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
}
