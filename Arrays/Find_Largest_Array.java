package Arrays;

import java.util.Scanner;

public class Find_Largest_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the Array : " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];
			}
		}
		System.out.println("----------OutPuts---------");
		System.out.println("Largest Array : " + max);
	}

}
