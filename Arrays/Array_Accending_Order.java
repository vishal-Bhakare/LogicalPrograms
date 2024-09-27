package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Accending_Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Array " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Accending order");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Accending order");
		System.out.println(Arrays.toString(arr));

	}
}
