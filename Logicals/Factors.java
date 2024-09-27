package Logicals;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Whict Factor No You Want ");

		int no = sc.nextInt();

		if (no <= 1) {

			System.out.println("Please Enter the Greter than 1");

			return;
		}

		System.out.println("Prime Factor of Number Is : " + no + ": ");

		// Step 1: Divide no by 2 until it is no longer divisible by 2

		while (no % 2 == 0) {

			System.out.println(2 + " ");

			no /= 2;
		}

		// Step 2: Check for odd factors starting from 3

		for (int i = 3; i * i <= no; i += 2) {
			// While i divides no, divide no by i and print i
			while (no % i == 0) {

				System.out.println(i + " ");

				no /= i;
			}

		}

		// Step 3: If no is still greater than 2, then no itself is a prime factor

		if (no > 2) {

			System.out.println(no);
		}

		System.out.println();

	}

}
