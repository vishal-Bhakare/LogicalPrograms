package Arrays;

import java.util.Scanner;

public class Odd_Position_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Arrays " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i += 2) {

			System.out.println("Odd Postion " + (i+1) + " Elements is : " + arr[i]);
		}
	}

}
