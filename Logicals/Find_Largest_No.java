package Logicals;

import java.util.Scanner;

public class Find_Largest_No {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number");

		int first = sc.nextInt();

		System.out.println("Enter the second Number");

		int second = sc.nextInt();

		System.out.println("Enter the third Number");

		int third = sc.nextInt();

		int largest;

		if (first >= second && first >= third) {

			largest = first;
		} else if (second >= first && second >= third) {

			largest = second;
		} else {

			largest = third;
		}
		
		
		System.out.println("Highest value is : "+largest);

	}

}
