package Logicals;

import java.util.Scanner;

public class Swap_No {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first No ");
		int no1 = sc.nextInt();

		System.out.println("Enter Second No ");
		int no2 = sc.nextInt();

		System.out.println("Before Swap");

		System.out.println(no1);
		System.out.println(no2);

		int temp;

		temp = no1;
		no1 = no2;
		no2 = temp;

		System.out.println("After Swap");

		System.out.println(no1);
		System.out.println(no2);

		System.out.println("-----------------------------------------------------");

		// Another Way Without use third vaeiable

		// Reset values to their original state for the second swap
		no1 = no1 + no2; // add two numbers
		no2 = no1 - no2; // subtract no2 from sum to get no1's original value
		no1 = no1 - no2; // subtract no2 (which is no1's original value) to get no2's original value

		System.out.println("After second swap (without using temp variable):");
		System.out.println("no1 = " + no1);
		System.out.println("no2 = " + no2);

	}

}
