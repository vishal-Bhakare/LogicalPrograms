package Arrays;

import java.util.Scanner;

public class Print_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int[] array = new int[size];
	

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the Array" + (i + 1) + " : ");
			array[i] = sc.nextInt();
		}

		System.out.println("Array Elemets Are : ");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

	}

}
