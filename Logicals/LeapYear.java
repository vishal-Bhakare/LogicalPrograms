package Logicals;

import java.util.Scanner;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

	
		System.out.print("Enter a 4-digit year: ");
		int year = sc.nextInt();

		
		if (year < 1000 || year > 9999) {
			System.out.println("Please enter a valid 4-digit year.");
			return;
		}

		// Determine if the year is a leap year
		boolean isLeap = false;

		// Leap year logic
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
					
					isLeap = true; // Divisible by 400 -> leap year
				}
				
			} else {
				
				isLeap = true; // Divisible by 4 and not divisible by 100 -> leap year
			}
		}

		// Output the result
		if (isLeap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
