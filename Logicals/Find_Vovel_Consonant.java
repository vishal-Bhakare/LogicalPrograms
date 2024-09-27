package Logicals;

import java.util.Scanner;

public class Find_Vovel_Consonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the charector to check");

		char ch = sc.next().toLowerCase().charAt(0);

		if ((ch > 'a' || ch < 'z')) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.println(ch + " Is Vovel");
			} else {
				System.out.println(ch + " Is Consonants");
			}

		} else {

			System.out.println("Invalid Inputs ");
		}
	}

}
