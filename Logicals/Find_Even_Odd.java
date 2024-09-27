package Logicals;

import java.util.Scanner;

public class Find_Even_Odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int no = sc.nextInt();

		for (int i = 0; i <= no; i++) {

			if (i % 2 == 0) {

				System.out.println(i + " is Even Number");
				System.out.println();
			} else {
				
				System.out.println(i + " is Odd Number");

			}

		}

	}

}
