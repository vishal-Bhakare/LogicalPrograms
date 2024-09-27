package Arrays;

import java.util.Scanner;

public class Find_Smallest_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Arrays");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the Array" + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if(arr[i]< min) {
				
				min = arr[i];
			}
		}
		
		System.out.println("Smallest Elements is : "+min);

	}

}
