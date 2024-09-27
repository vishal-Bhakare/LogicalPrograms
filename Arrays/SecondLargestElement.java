package Arrays;

import java.util.Scanner;

public class SecondLargestElement {

	static int firstArray;
	static int secondArray;

	public static int secondLagestElement(int[] input) {

		// Checking first two elements of input array
		if (input[0] > input[1]) {

			// If first element is greater than second element
			firstArray = input[0];
			secondArray = input[1];

		} else if (input[0] < input[1]) {

			// If second element is greater than first element
			firstArray = input[1];
			secondArray = input[0];

		}

		// Checking remaining elements of input array

		for (int i = 2; i < input.length; i++) {

			if (input[i] > firstArray) {

				secondArray = firstArray;
				firstArray = input[i];

			} else if (input[i] > secondArray && input[i] < firstArray) {

				secondArray = input[i];

			}

		}

		return secondArray;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arry");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Array " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}
		secondLagestElement(arr);
		System.out.println("Second Largest Element is : " + secondArray);
	}
}
