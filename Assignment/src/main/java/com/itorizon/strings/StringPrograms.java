package com.itorizon.strings;

import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * This class shows examples of String programs in java
 * @author Thippeswamy H
 * @version 1.0.0
 */
@Service
public class StringPrograms {
	
	Scanner scanner = new Scanner(System.in);
	
	public void countNoOfCharacters() {
		System.out.println("Java Program to count the total number of characters in a string");
		int count = 0;
		System.out.print("Enter a string to check number of characters:");
		String value=scanner.nextLine();
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("The total number of characters of string: " + count);
	}
	
	
	public void countVowelsAndConsonants() {
		System.out.println("Java Program to count the total number of vowels and consonants in a string");
		int vowels = 0;
		int consonants = 0;
		System.out.print("Enter a string to check number of vowels and consonants:");
		String res = scanner.nextLine();
		for (int i = 0; i < res.length(); i++) {
			char c = res.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c =='O' || c == 'U') {
					vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("The number of vowels count is: " + vowels);
		System.out.println("The number of consonants count is: " + consonants);
	}
	
	
	
	public void removeWhiteSpace() {
		System.out.println("Java Program to remove all the white spaces from a string");
		String res = "";
		System.out.println("Enter a String with spaces and We will remove spaces:");
		String value = scanner.nextLine();
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) != ' ') {
				res = res + value.charAt(i);
			}
		}
		System.out.println("Desired output is:" + res);
	}
	
	
	
	public void caseCoversion() {
		System.out.println("Java Program to replace lower-case characters with upper-case and vice-versa");
		String res = "";
		System.out.print("Enter a string to conver upper case to lower case and viceversa:");
		String value = scanner.nextLine();
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 65 && value.charAt(i) <= 90) {
				res = res + (char) (value.charAt(i) + 32);
			} else {
				res = res + (char) (value.charAt(i) - 32);
			}
		}
		System.out.println("Desired output is: " + res);
	}
	
	
	
	public void frequencyOfCharacter() {
		System.out.println("Java Program to find the frequency of characters");
		System.out.print("Enter a string to find frequency of characters");
		String value = scanner.nextLine();
		int [] upper = new int [26];
		int [] lower = new int [26];
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 65 && value.charAt(i) <= 90) {
				int j = value.charAt(i) - 65;
				upper[j] = upper[j] + 1; 
			} else {
				int j = value.charAt(i) - 97;
				lower[j] = lower[j] + 1; 
			}
		}
		for (int i = 0; i < upper.length; i++) {
			if (upper[i] > 0) {
				System.out.println((char)(65 + i) + " = " + upper[i]);
			}
		}
		for (int i = 0; i < lower.length; i++) {
			if (lower[i] > 0) {
				System.out.println((char)(97 + i) + " = " + lower[i]);
			}
		}
	}
	
	
	public void replaceSpaceWithCharacter() {
		System.out.println("Java Program to replace the spaces of a string with a specific character");
		System.out.println("Enter a string ");
		String value = scanner.nextLine();
		System.out.println("enter a character you want to replace in place of space");
		String sc = scanner.nextLine();
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == ' ') {
				value = value.replace(" " , sc);
			}
		}
		System.out.println("Desired output is:" + value);
	}
	
	public void divideEqualParts() {
		System.out.println("Java Program to divide a string in 'N' equal parts.");
		System.out.println("Enter the String");
		String name	=scanner.nextLine();
		int length = name.length();
		int size;
		System.out.println("Enter the number of times to be divided");
		int number = scanner.nextInt();
		if (length % number!= 0) {
			System.out.println("Given string cant divisible by"+ number);
		}
		else {
			size= length/number;
			for (int i = 0; i < length; i++) {
				if (i+1 % size == 0) {
					System.out.print( name.charAt(i));
				}
			}
		}
	}
	
	public void minAndMaxOccuringChar() {
		System.out.println("Java Program to find maximum and minimum occurring character in a string");
		System.out.println("Enter String");
		String string = scanner.nextLine();
		int[] array     = new int[127];
		for (int i = 0; i < string.length(); i++) {
			array[string.charAt(i)] =  array[string.charAt(i)] + 1;
		}
		int max = -1;
		int min = 127;
		char max_char = ' ';
		char min_char = ' ';
		for (int i = 0; i < string.length(); i++) {
			if (max < array[string.charAt(i)]) {
				max = array[string.charAt(i)];
				max_char = string.charAt(i) ;
			}
			if (min > array[string.charAt(i)]) {
				min = array[string.charAt(i)];
				min_char = string.charAt(i) ;
			}
		}
		System.out.println(max_char);
		System.out.println(min_char);
	}
	
	
	public void reverseOfString() {
		System.out.println("Java Program to find Reverse of the string");
		System.out.println("Enter the string");
		String name = scanner.nextLine();
		int size = name.length();
		String reverse = "";
		for (int i = size-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse of   "+ name +"  is:  " + reverse);
	}
	
	
	public void findDupplicate() {
		System.out.println("Java program to find the duplicate characters in a string");
		System.out.println("Enter the strings");
		String name  = scanner.nextLine();
		int count;
		char dup_character [] = name.toCharArray();
		for (int i = 0; i < dup_character.length; i++) {
			count = 1;
			for (int j = i+1; j < dup_character.length; j++) {
				if (dup_character[i] == dup_character[j] && dup_character[i] !=' ') {
					count++;
					dup_character[j]='0';
				}
			}
			if (count > 1 && dup_character[i] !='0') {
				System.out.println(dup_character[i]);
			}
		}
	}
	
	
	public void findLargeAndSmallWord() {
		System.out.println("Java Program to find the largest and smallest word in a string");
		System.out.println("Enter the String ");
		String string = scanner.nextLine();
		String[] word = string.split(" ");
		String shortString = word[0];
		String longString = "";
		for (String words : word) {
			if (words.length() < shortString.length()) {
				shortString = words;
			}
			else if (words.length() > longString.length()) {
				longString = words;
			}
		}	
		System.out.println("shortest word is: " + shortString );
		System.out.println("shortest word is: " + longString );
	}
	
	
	public void seperateIndividualChar() {
		System.out.println("Java Program to separate the Individual Characters from a String");
		System.out.println("Enter  string");
		String name = scanner.nextLine();
		for(int i = 0; i < name.length(); i++){  
			System.out.print(name.charAt(i) + "  ");  
		} 
	}
	
	
	public void convertCharToString() {
		System.out.println("Java Program to Convert char to String and String to Char");
		System.out.println("Enter the character to convert into string");
		char character = scanner.next().charAt(0);
		String string = Character.toString(character);
		System.out.println("String is: "+string);
		scanner.nextLine();
		System.out.println("Enter the string to convert to character");
		String string1 = scanner.nextLine();
		for(int i=0; i<string1.length();i++){
			char ch = string1.charAt(i);
			System.out.println("Character at "+i+" Position: "+ch);
		} 
	}
	
	
	
	public void findDuplicateElements() {
		System.out.println("Java Program to find duplicate characters in a String");
		System.out.println("Enter the strings");
		String string  = scanner.nextLine();
		int count;
		char dup_char [] = string.toCharArray();
		for (int i = 0; i < dup_char.length; i++) {
			count = 1;
			for (int j = i+1; j < dup_char.length; j++) {

				if (dup_char[i] == dup_char[j] && dup_char[i]!=' ') {
					count++;
					dup_char[j]='0';
				}
			}
			if (count > 1 && dup_char[i] !='0') {
				System.out.println( dup_char[i]);
			}
		}
	}
	
	
	public void sortAlpabeticalOrder() {
		System.out.println("Java Program to sort strings in alphabetical order");
		int num;
		String temp;
		System.out.print("Enter number of names :");
		num = scanner.nextInt();
		String names[] = new String[num];
		System.out.println("Enter all the names:");
		for(int i = 0; i < num; i++) {
			names[i] = scanner.nextLine();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.print("Names in Sorted Order:");
		for (int i = 0; i < num - 1; i++) {
			System.out.print(names[i] + ",");
		}
		System.out.print(names[num - 1]);
	}
	
	
}
