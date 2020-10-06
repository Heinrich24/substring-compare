package com.heinrich;

import java.util.Scanner;

public class MyMain {

	public static String getSmallestAndLargest(String s, int k) {
		
		// Create an initial substring value so that it can be used to compare
		// as we loop through the entire string value
		String substring = s.substring(0, k);
		
		// Lets assign the initial generic substring value for initial comparison 
		String smallest = substring;
		String largest = substring;
		
		// Now lets loop through the entire string and compare it with our initial substring value (smallest and largest)
		for (int i = 1; i <= s.length() - k; i++) {
			// Create a substring of length 'k'
			substring = s.substring(i, i + k);
			// If current substring is lexicographically smaller than 'smallest'
			if (substring.compareTo(smallest) < 0) {
				smallest = substring;
			}
			// If current substring is lexicographically larger than 'largest'
			if (substring.compareTo(largest) > 0) {
				largest = substring;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		System.out.println("Enter input and press enter to proceed");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));

	}

}
