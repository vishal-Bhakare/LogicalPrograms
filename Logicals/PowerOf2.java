package Logicals;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Power of no in between (0 <= N < 31) : ");

		int no = sc.nextInt();

		// check the conditions valid or Not
		if (no < 0 || no > 31) {

			System.out.println("Please Enter the no in between (0 <= N < 31) : ");
			return;
		}

		int power = 1;

		for (int i = 1; i <= no; i++) {

			power *= 2;

			System.out.println("2^" + i + " = " + power);
		}

	}

}
