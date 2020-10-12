package com.itorizon.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * This class shows example of arrays programming in java
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class ArraysPrograms {
	
	Scanner scanner = new Scanner(System.in);
	
	public void arrayListToArray() {
		System.out.println("Java program to convert an ArrayList to an array");
		ArrayList<String> al = new ArrayList<>();
		al.add("Krishna");
		al.add("Arjuna");
		al.add("Karna");
		al.add("Bheema");
		System.out.println("The elements of the array list are: " + al);
		String [] array = new String[al.size()];
		al.toArray(array);
		System.out.print("The elemets of array are: " );
		for (String element : array) {
			System.out.print(element + ",");
		}
	}
	
	public void pairOfElementsEqualToNumber() {
		System.out.println("Java program to find all pairs of elements in an array whose sum is equal to a specified number");
		System.out.print("Enter the size of array: ");
		int size = scanner.nextInt();
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the specified number: ");
		int number = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == number) {
					System.out.println(array[i] + " + " + array[j] +  " = " + number);
				}
			}
		}
	}
	 
	public void equalityOfTwoArrays() {
		System.out.println("Java program to test the equality of two arrays");
		boolean res = true;
		System.out.print("Enter the size of 1st array: ");
		int size = scanner.nextInt();
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 2nd array: ");
		int size2 = scanner.nextInt();
		int [] array2 =new int [size2]; 
		for (int i = 0; i < size2; i++) {
			System.out.print("Enter " + i + " element: ");
			array2[i] = scanner.nextInt();
		}
		if (size == size2) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array2[i]) {
					res = false;
				}
			}
		} else {
			System.out.println("Two arrays are not equal");
			return;
		}
		if (res) {
			System.out.println("Two  arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}
	
	public void findMissingNumber() {
		System.out.println("Java program to find a missing number in an array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int sum = 0;
		int [] array =new int [size]; 
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		int exp_sum = size * ((size + 1) / 2);
		for( int i : array) {
			sum = sum + i;
		}
		int result = sum - exp_sum;
		System.out.println("Missing number is: " + result);
	}
	
	
	public void findCommonElements() {
		System.out.println("Find common elements from three sorted (in non-decreasing order) arrays");
		System.out.print("Enter the size of 1st array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 2nd array: ");
		int [] ar2 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar2.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar2[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of 3rd array: ");
		int [] ar3 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar3.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar3[i] = scanner.nextInt();
		}
		int x = 0, y = 0, z = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (x < ar1.length && y < ar2.length && z < ar3.length) 
		{
			if (ar1[x] == ar2[y] && ar2[y] == ar3[z]) {
				al.add(ar1[x]);
				x++; y++; z++;
			} else if (ar1[x] < ar2[y]){
				x++;
			} else if (ar2[x] < ar3[y]){
				y++;
			} else {
				z++;
			}
		}
		System.out.println("Common elemets are: " + al);
	}
	
	
	public void moveZeroToEnd() {
		System.out.println("Java program to move all 0's to the end of an array");
		System.out.print("Enter the size of  array: ");
		int count = 0;
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		//move all non-zeroes element to the front
        for(int i = 0; i < ar1.length; i++) {
            if(ar1[i] != 0) {
               ar1[count++] = ar1[i];
             }
         }
      //remaining elements are zero.
        while(count < ar1.length) {
            ar1[count++] = 0;
         }
        System.out.println("Desired output is: ");
        for(int j = 0; j < ar1.length; j++) {
            System.out.print(ar1[j] + " ");
         }
	}
	
	
	public void noOfEvenAndOdd() {
		System.out.println("Java program to find the number of even and odd integers in a given array of integers");
		System.out.print("Enter the size of  array: ");
		int count = 0;
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				count++ ;
			}
		}
		System.out.println("The number of even integer count is: " + count);
		System.out.println("The number of odd integer count is: " + (ar1.length - count));
	}
	
	
	
	public void differenceBetweenLargeAndSmall() {
		System.out.println("Java program to get the difference between the largest and smallest values in an array of integers");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int min_number = ar1[0];
		int max_number = ar1[0];
		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] > max_number) {
				max_number = ar1[i];
			}
			else if (ar1[i] < min_number) {
				min_number = ar1[i];
			}
		}
		System.out.println("The difference b/n max and min value is: " + (max_number-min_number));
	}
	
	public void avgOfIntegers() {
		System.out.println("Java program to compute the average value of an array of integers except the largest and smallest values");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int min_number = ar1[0];
		int max_number = ar1[0];
		int sum = ar1[0];
		for (int i = 1; i < ar1.length; i++) {
			sum = sum + ar1[i];
			if (ar1[i] > max_number)
				max_number = ar1[i];
			else if (ar1[i] < min_number)
				min_number = ar1[i];
		}
		float numerator = sum - max_number - min_number ;
		float denaminator = ar1.length - 2;
		System.out.println("average value of an array of integers except the largest and smallest values: " + numerator / denaminator);
	}
	
	
	public void arrayContainsSpecifiedElement() {
		System.out.println("Java program to check if an array of integers contains two specified elements 65 and 77");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == 65) {
				for (int j = 0; j < ar1.length; j++) {
					if (ar1[j] == 77) {
						System.out.println("array of integers contains two specified elements 65 and 77");
						return ;
					}
				}
			}
		}
		System.out.println("array of integers doesnot contains two specified elements 65 and 77");
	}
	
	
	public void removeDuplicate() {
		System.out.println("Java program to remove the duplicate elements of a given array and return the new length of the array");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.print("The array elements are: ");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ",");
		}
		int index = 1;
		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] != ar1[index-1])
				ar1[index++] = ar1[i];
		}
		System.out.println();
		System.out.println("The new length of the array after removing duplicates: " + index);
	}
	
	
	public void sumOfElementsOfArray() {
		System.out.println("Write a Java program to find the sum of the two elements of a given array which is equal to a given integer");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		System.out.println("The index of the elements whose sum is: "+number);
		for(int i=0; i<ar1.length; i++){
			for (int j=i + 1; j<ar1.length; j++){
				if((ar1[i]+ar1[j])== number){
					System.out.println(i+", "+j);
				}
			}
		}
	}
	
	
	public void smallestAndSecondSmallestElement() {
		System.out.println("Java program to find smallest and second smallest elements of a given array");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		Arrays.sort(ar1);
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("Smallest number of an array is: " + ar1[i]);
			System.out.println("Second smallest number of an array is: " + ar1[i + 1]);
			return ;
		}
	}
	
	
	
	public void zeroOnLeftOneOnRight() {
		System.out.println("Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		Arrays.sort(ar1);
		System.out.print("Result after segregation: ");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ",");
		}
	}
	
	
	public void negativeBeforePositiveElements() {
		System.out.println("Java program to arrange the elements of a given array of integers where all negative integers appear before all the positive integers");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		Arrays.sort(ar1);
		System.out.print("Result after segregation: ");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ",");
		}
	}
	
	
	
	public void positiveBeforeNegativeElements() {
		System.out.println("Java program to arrange the elements of a given array of integers where all positive integers appear before all the negative integers");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		Arrays.sort(ar1);
		System.out.print("Result after segregation: ");
		for (int i = ar1.length - 1; i >= 0; i--) {
			System.out.print(ar1[i] + ",");
		}
	}
	
	
	public void seperateEvenAndOdd() {
		System.out.println("Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		int [] ar2 = new int [size];
		int [] ar3 = new int [size];
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int j = 0;
		int k = 0;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 ==0 ) {
				ar2[j] = ar1[i];
				j++;
			} else {
				ar3[k] = ar1[i];
				k++;
			}
		}
		System.out.println("Result after seperating even and odd number");
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i] != 0) {
				System.out.print(ar2[i] + ",");
			}
		}
		for (int i = 0; i < ar3.length; i++) {
			if (ar3[i] != 0) {
				System.out.print(ar3[i] + ",");
			}
		}
	}
	
	
	public void sumCloseToZero() {
		
	}
	
	
	public void sortNumericAndStringArray() {
		System.out.println("Java program to sort a numeric array and a string array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
          System.out.println(" numeric array : "+Arrays.toString(ar1));
		  Arrays.sort(ar1);
		  System.out.println("Sorted numeric array : "+Arrays.toString(ar1));
		  scanner.nextLine();
		  System.out.println("Enter the size of array");
		  int size1= scanner.nextInt();
		  String [] strings =  new String [size1];
		 System.out.println("enter the strings");
		 for (int i = 0; i < size1 ; i++) {
			strings[i] =  scanner.nextLine();
			}
		 System.out.println(" String array : "+Arrays.toString(strings));
		 Arrays.sort(strings);
		  System.out.println("Sorted String array : "+Arrays.toString(strings));
	}
	
	
	public void sumOfArray() {
		System.out.println("Java program to sum values of an array");
		int sum = 0;
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		for (int i : ar1) {
			sum = sum + i;
			}
		System.out.println("The sum of array elements: " + sum);
	}
	
	
	public void printPattern() {
		System.out.println("Java program to print the following grid");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" _ ");
				}
			System.out.println();
			}
	}
	
	
	public void avaerageOfArray() {
		System.out.println("Java program to calculate the average value of array elements");
		int sum = 0;
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		 for(int i=0; i < ar1.length ; i++) {
		     sum = sum + ar1[i];
		     }
		 double average = sum / ar1.length;
		 System.out.println("The Average of the array elements is : " + average);
	}
	
	
	
	public void containsSpecificElement() {
		System.out.println("Java program to test if an array contains a specific value");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Enter specific element");
		int number = scanner.nextInt();
	      for(int i = 0; i<ar1.length; i++){
	         if(number == ar1[i]){
	            System.out.println("The given Array contains " + number);
	            }
	         }
	}
	
	
	
	public void findIndex() {
		System.out.println("Java program to find the index of an array element");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to find  index");
		int element= scanner.nextInt();
		int  index;
		for (int i = 0; i < ar1.length; i++){
		     if (element == ar1[i]) {
		    	 index = i;
		    	 System.out.println("The entered " + element +" is found at " + index);
		    	 }
		     }
	}
	
	
	public void removeElement() {
		System.out.println("Java program to remove a specific element from an array");
		System.out.println("Enter the size of array");
		System.out.print("Enter the size of  array: ");
		int [] ar1 =new int [scanner.nextInt()]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.println(" Array : "+Arrays.toString(ar1));
		System.out.println("Enter the index of the array to be removed");
		int index = scanner.nextInt();
		   for(int i = index; i < ar1.length -1; i++){
			   ar1[i] = ar1[i + 1];
		      }
		   System.out.println("Result after removing element is : "+Arrays.toString(ar1));
	}
	
	
	
	public void copyArrayElements() {
		System.out.println("Java program to copy an array by iterating the array");
		System.out.println("Enter the size of array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		  System.out.println("Given array is: "+Arrays.toString(ar1)); 
		  int [] ar2 = new int[size];
		  for(int i=0; i < ar1.length; i++) {
    	   ar2[i] = ar1[i];
    	   }
		  System.out.println("New Array is : "+Arrays.toString(ar2));
	}
	
	
	
	public void insertElement() {
		System.out.println("Java program to insert an element (specific position) into an array");
		System.out.println("Enter the size of array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Enter the index of array");
		int index = scanner.nextInt();
		System.out.println("Enter the element to be inserted");
		int newelement = scanner.nextInt();
		System.out.println("The Array is: "+Arrays.toString(ar1)); 
		for(int i=ar1.length-1; i > index; i--){
			 ar1[i] = ar1[i-1];
			   }
		 ar1[index] = newelement;
		 System.out.println("New Array is: "+Arrays.toString(ar1));
	}
	
	
	public void findMaxAndMin() {
		System.out.println("Java program to find the maximum and minimum value of an array");
		System.out.println("Enter the size of array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int maximum = ar1[0];
		int  minimum = ar1[0];
		for (int i = 1; i < ar1.length; i++) {
			if(maximum < ar1[i]) {
				maximum = ar1[i];
			}
			if (minimum > ar1[i]) {
				minimum = ar1[i];
				}
			}
		System.out.println("The maximum element in a given array is  "+ maximum);
		System.out.println("Thenminimum element in a given array is  " + minimum);
	}
	
	
	public void reverseArray() {
		System.out.println("Java program to reverse an array of integer values");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		int temp;
		int begin = 0;
		int end = size - 1;
		while(begin < end) {
			temp = ar1[begin];
			ar1[begin] = ar1[end];
			ar1[end] = temp;
			begin++;
			end --;
			}
		for (int j = 0; j < size; j++) {
	    	   System.out.print(ar1[j]);
			}
	}
	
	
	public void duplicateValues() {
		System.out.println("Java program to find the duplicate values of an array of integer values");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		for (int i = 0; i < ar1.length-1; i++) {
			for (int j = i+1; j < ar1.length; j++) {
                   if (ar1[i] == ar1[j]) {
                	   System.out.println("The duplicate values are " + ar1[j]);
                	   }				
                   }
			}
	}
	
	
	public void duplicateValuesStrings() {
		System.out.println("Java program to find the duplicate values of an array of string values");
		System.out.println("Enter the strings");
        String string  = scanner.nextLine();
        int count;
        char charater [] = string.toCharArray();
        for (int i = 0; i < charater.length; i++) {
               count = 1;
               for (int j = i+1; j < charater.length; j++) {
               if (charater[i] == charater[j] && charater[i]!=' ') {
					count++;
					charater[j]='0';
				}
		 }
               if (count > 1 && charater[i]!='0') {
					System.out.print( charater[i]);
				}
               }
	}
	
	
	public void commonElements() {
		System.out.println("Java program to find the common elements between two arrays (string values)");
		System.out.println("Enter the size of the  string array");
        int arraySize	= scanner.nextInt();
        String[] string1 = new String[arraySize];
        String[] string2 = new String[arraySize];
        scanner.nextLine();
        System.out.println(" Enter the string for array1 ");
        for (int i = 0; i < arraySize; i++) {
        	  string1[i] = scanner.nextLine();
			}
        System.out.println(" Enter the string for array2 ");
        for (int i = 0; i < arraySize; i++) {
        	 string2[i] = scanner.nextLine();
			}
        System.out.println("Array1 : "+Arrays.toString(string1));
        System.out.println("Array2 : "+Arrays.toString(string2));
        
        for (int i = 0; i < string1.length; i++){
            for (int j = 0; j < string2.length; j++){
                if(string1[i].equals(string2[j])){
                    System.out.print(string1[i]);
                    }
                }
            }
	}
	
	public void commonElementsOfIntArray() {
		System.out.println("Java program to find the common elements between two arrays of integers");
		System.out.println("Enter the size of type array");
		int size = scanner.nextInt();
		int[] ar1 = new int[size];
		int[] ar2 = new int[size];
		scanner.nextLine();
		System.out.println("Enter the element  for  array 1");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Enter the elements for array2");
		for (int i = 0; i < ar2.length; i++) {
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Array1 : "+Arrays.toString(ar1));
		System.out.println("Array2 : "+Arrays.toString(ar2));
		System.out.println("The repeated elememts are: ");
		for (int i = 0; i < ar1.length; i++){
			for (int j = 0; j < ar2.length; j++){
				if(ar1[i] == (ar2[j])){
					System.out.print(ar1[i]);
				}
			}
		}
	}

	
	public void removeDuplicateElement() {
		System.out.println("Java program to remove duplicate elements from an array");
		System.out.print("Enter the size of  array: ");
		int size = scanner.nextInt();
		int [] ar1 =new int [size]; 
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("Enter " + i + " element: ");
			ar1[i] = scanner.nextInt();
		}
		 System.out.println(" numeric array : "+Arrays.toString(ar1));
		 
		 Arrays.sort(ar1);
	     int  length = ar1.length;
	     int temp [] = new int [ar1.length];
	     int j = 0;
	     
	     for (int i = 0; i < length - 1; i++) {
	    	 if (ar1[i]!= ar1[i + 1]) {
	    		 temp[ j++ ] = ar1 [i];
				}
			}
	     temp[ j++ ] = ar1[ length - 1 ];
	     
	     for (int k = 0; k < j; k++) {
	    	 System.out.print(temp[k]);
			}
	}
	
	
	public void secondLargest() {
		System.out.println("Java program to find the second largest element in an array");
		 int temp;
			System.out.print("Enter the size of  array: ");
			int size = scanner.nextInt();
			int [] ar1 =new int [size]; 
			for (int i = 0; i < ar1.length; i++) {
				System.out.print("Enter " + i + " element: ");
				ar1[i] = scanner.nextInt();
			}
			  for(int i = 0; i<size; i++ ){
				  for(int j = i+1; j<size; j++){
					  if(ar1[i]>ar1[j]){
						  temp = ar1[i];
						  ar1[i] = ar1[j];
						  ar1[j] = temp;
						  }
					  }
				  }
			  System.out.println("The second largest number : "+ar1[size-2]);
	}
	
	
	
	public void secondSmallest() {
		System.out.println("Java program to find the second smallest element in an array");
		 int temp;
			System.out.print("Enter the size of  array: ");
			int size = scanner.nextInt();
			int [] ar1 =new int [size]; 
			for (int i = 0; i < ar1.length; i++) {
				System.out.print("Enter " + i + " element: ");
				ar1[i] = scanner.nextInt();
			}
			  for(int i = 0; i>size; i++ ){
				  for(int j = i+1; j>size; j++){
					  if(ar1[i] < ar1[j]){
						  temp = ar1[i];
						  ar1[i] = ar1[j];
						  ar1[j] = temp;
						  }
					  }
				  }
			  System.out.println(" second smallest number is:: "+ar1[size - 2]);
	}
	
	
	public void addMatrices() {
		System.out.println("Java program to add two matrices of the same size");
		  int rowNum, columnNum, c, d;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Input number of rows of matrix");
	      rowNum = in.nextInt();
	      System.out.println("Input number of columns of matrix");
	      columnNum  = in.nextInt();
	      int array1[][] = new int[rowNum][columnNum];
	      int array2[][] = new int[rowNum][columnNum];
	      int sum[][] = new int[rowNum][columnNum];
	      System.out.println("Input elements of first matrix");
	      for (  c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	            array1[c][d] = in.nextInt();
	      System.out.println("Input the elements of second matrix");
	      for ( c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	            array2[c][d] = in.nextInt();
	      for ( c = 0 ; c < rowNum ; c++ )
	         for ( d = 0 ; d < columnNum ; d++ )
	             sum[c][d] = array1[c][d] + array2[c][d]; 
	      System.out.println("Sum of the matrices:-");
	      for ( c = 0 ; c < rowNum ; c++ ) {
	         for ( d = 0 ; d < columnNum ; d++ )
	            System.out.print(sum[c][d]+"\t");
	         System.out.println();
	      }
	}
	
	
}
