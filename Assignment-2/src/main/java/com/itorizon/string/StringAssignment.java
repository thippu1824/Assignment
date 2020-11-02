package com.itorizon.string;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Thippeswamy H
 * 
 * @version 1.0.0
 *
 */

@Component
public class StringAssignment {
	/*
	 * This class contains all the all String and Character Manipulation methods
	 * 
	 */

	public static int charactersCount() {

		// Java Program to count the total number of characters in a stringArray

		String string = "The best of both worlds";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("\nDeclared String: " + string);
		System.out.println("Total Character count in the String: " + count);
		return count;
	}

	// Java Program to count the total number of vowels and consonants in a
	// string
	public static int[] vowelsAndConsonantsCount() {
		int[] count = new int[2];
		String str = "The best of both worlds";
		System.out.println("\nDeclared String: " + str);
		int vcount = 0, ccount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				ccount++;
			}
		}
		System.out.println("Number of Vowels: " + vcount);
		System.out.println("Number of Consonants: " + ccount);

		count[0] = vcount;
		count[1] = ccount;

		return count;

	}

	// Java Program to divide a string in 'N' equal parts.
	public static boolean splitString() {
		String str = "The best of both world";
		int n = 5;
		int strSize = str.length();
		int partSize;
		if (strSize % n != 0) {
			System.out.println("\nThe size of the given string is not divisible by " + n);
			return false;
		} else {
			System.out.println("\nThe given string is: " + str);
			System.out.print("The string divided into " + n + " parts and they are: ");
			partSize = strSize / n;
			for (int i = 0; i < strSize; i++) {
				if (i % partSize == 0)
					System.out.println();
				System.out.print(str.charAt(i));
			}
		}
		return true;
	}

	// Java Program to remove all the white spaces from a string
	public static String removeWhiteSpaces() {
		String str = "Remove white spaces";
		// Removes the white spaces using RegularExpression
		str = str.replaceAll("\\s+", "");
		System.out.println("\nString after removing all the white spaces : " + str);
		return str;
	}

	// Java Program to replace lower-case characters with upper-case and
	// vice-versa

	public static String caseConversion() {
		String str = "Abhimanyu";
		StringBuffer newStr = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("\nString after case conversion : " + newStr);
		return newStr.toString();
	}

	// Java Program to replace the spaces of a string with a specific character

	public static String replaceCharacter() {
		String string = "Once in a blue moon";
		System.out.println("\nOriginal String: " + string);
		char ch = '-';

		// Replace space with specific character ch
		string = string.replace(' ', ch);
		System.out.println("Specific Character: " + ch);
		System.out.println("String after replacing spaces with specific character: " + string);
		return string;
	}

	// Java Program to find maximum and minimum occurring character in a string

	public static char[] maxAndMinCharacters() {
		char[] count = new char[2];
		String str = "grass is greener on the other side";
		System.out.println("\nDeclared String: " + str);
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int min;
		int max;

		char string[] = str.toCharArray();

		for (int i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					string[j] = '0';
				}
			}
		}

		min = max = freq[0];
		for (int i = 0; i < freq.length; i++) {

			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}
			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);

		count[0] = minChar;
		count[1] = maxChar;

		return count;
	}

	// Java Program to find Reverse of the string
	public static String reverseString() {
		String string = "SWAMY";
		String reversedStr = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + string.charAt(i);
		}
		System.out.println("\nOriginal string: " + string);
		System.out.println("Reverse of given string: " + reversedStr);
		return reversedStr;
	}

	// Java program to find the duplicate characters in a string
	public static char duplicateCharacters() {

		String string = "JAVA";
		System.out.println("\nOriginal string: " + string);
		int count;

		char stringArr[] = string.toCharArray();

		System.out.print("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < stringArr.length; i++) {
			count = 1;
			for (int j = i + 1; j < stringArr.length; j++) {
				if (stringArr[i] == stringArr[j] && stringArr[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					stringArr[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && stringArr[i] != '0') {
				System.out.print(stringArr[i] + " ");
				return stringArr[i];
			}
		}
		return 0;

	}

	// Java program to find the duplicate words in a string
	public static char[] duplicateWords() {

		String string = "Hi I am Srinivas and I am from Gadag";
		System.out.println("\n\nOriginal string: " + string);
		int count;
		string = string.toLowerCase();
		String words[] = string.split(" ");

		System.out.print("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";

				}
			}
			if (count > 1 && words[i] != "0")
				System.out.print(words[i] + " ");
			char[] ch = new char[words.length];
			return ch;
		}
		return null;

	}

	// Java Program to find the frequency of characters

	public static void frequencyOfCharacters() {
		String str = "picture perfect";
		System.out.println("\n\nOriginal string: " + str);
		int[] freq = new int[str.length()];
		char string[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.print("Characters and their corresponding frequencies: ");
		for (int i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.print(string[i] + "-" + freq[i] + " ");

		}
	}

	// 15. Java Program to separate the Individual Characters from a String

	public static String individualCharacter() {
		String string = "Srinivas";
		String res = "";

		// Displays individual characters from given string
		System.out.print("\nIndividual characters from given string: ");

		// Iterate through the string and display individual character
		for (int i = 0; i < string.length(); i++) {
			res = res + (string.charAt(i) + "  ");
		}
		return res;
	}

	// Java Program to Convert char to String
	public static String charToString() {
		char ch = 'a';
		System.out.println("\n\nCharacter Declared: " + ch);
		String str = String.valueOf(ch);
		System.out.println("Converted String: " + str);
		return str;
	}

	// Java Program to Convert String to char
	public static String stringToChar() {
		String str = "Swamy";
		System.out.println("\nString Declared: " + str);
		char[] chars = str.toCharArray();
		String res = Arrays.toString(chars);
		System.out.println("Converted String to Characters: " + res);
		return res;
	}

	// Java Program to sort strings in alphabetical order
	public static String sortString() {

		String str = "srinivas";
		System.out.println("\nOriginalString: " + str);
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		String res = new String(charArray);
		System.out.println("Sorted String: " + res);
		return res;
	}
}
