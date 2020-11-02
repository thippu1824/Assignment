package com.itorizon;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itorizon.arrays.ArraysAssignment;
/**
 * 
 * @author Thippeswamy H
 * @version 1.0.0
 * 
 */
@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {

	@Autowired
	private ArraysAssignment arraysAssignment;

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Arrays to test methods
		System.out.println("\n\nArray Assignment Method Resolutions");
		System.out.println("-------------------------------------------");
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };

		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };

		int[] arr2 = { 2, 7, 4, -5, 11, 5, 20 };

		int[] arr3 = { 1, 3, 4, 5, 6 };

		int[] arr4 = { 2, 7, 4, 0, 11, 5, -1 };

		int[] arr5 = { 10, 7, 10, 10, 11, 5, -1 };

		int[] arr6 = { 20, 20, 30, 40, 50, 50, 50 };

		int[] arr7 = { 1, 2, 4, 5, 6 };

		int[] arr8 = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };

		int[] arr9 = { 1, -2, 3, -5, -8, -3, 2, 5, 4, -1 };

		int[] arr10 = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };

		int[] arr11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// key to test contains method
		int key = 85;

		// rows to test printGrid method
		int rows = 6;

		// columns to test printGrid method
		int columns = 9;

		// to test removeElement method
		int element = 66;

		// to test sumOfTwoElements method
		int target = 6;

		// String Array for Test Purpose
		String[] stringArray = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		ArraysAssignment.findDifference(arr1);

		int[] res = ArraysAssignment.positiveElementsBefore(arr10);
		System.out.println("Desired output is: " + Arrays.toString(res));

	}

}
