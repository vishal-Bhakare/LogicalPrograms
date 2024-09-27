package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Array " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Sort");

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;

				}

			}

		}
		System.out.println("After sort");
		System.out.println(Arrays.toString(arr));

		System.out.println("-------Another Way-----------------");

		System.out.println("sort again After Sort ");

		Arrays.sort(arr);

		System.out.println("Array elements in reverse order:");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
