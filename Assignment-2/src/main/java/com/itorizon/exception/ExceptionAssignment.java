package com.itorizon.exception;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author Srinivas N V
 * @version 1.0.0
 *
 *
 */
@Component
public class ExceptionAssignment {

	public static void divide() {

		try {
			int arr[] = new int[7];
			arr[4] = 30 / 0;
			System.out.println("Last Statement of try block");
		} catch (ArithmeticException e) {
			System.out.println("\nYou should not divide a number by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nAccessing array elements outside of the limit");
		} catch (Exception e) {
			System.out.println("\nSome Other Exception");
		}
	}

	public static void stackTrace() {

		try {
			int arr[] = new int[7];
			arr[4] = 30 / 0;
		} catch (Exception e) {
			System.out.println("\nPrinting stack of the Exception");
			e.printStackTrace();
		}
	}

}
