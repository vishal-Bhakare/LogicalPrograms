package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfArray {

	public static void main(String[] args) {

		/*
		 * Frequency in an array refers to the number of times an element appears in
		 * that array.
		 * 
		 * For example, in the array:
		 * 
		 * [10, 20, 10, 30, 20, 30, 30]
		 * 
		 * The frequency of:
		 * 
		 * 10 is 2 (because 10 appears twice) 20 is 2 (because 20 appears twice) 30 is 3
		 * (because 30 appears three times)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		int[] freq = new int[size];
		int repeat = -1; // A value to mark the already counted elements

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++; // Variable 'count' to keep track of the frequency of each element
					freq[j] = repeat; // Mark the element at position 'j' as counted
				}
			}
			if (freq[i] != repeat) {

				freq[i] = count; // Store the frequency of element arr[i] at position i
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (freq[i] != repeat) {
				System.out.println(arr[i] + " Elements Frequency is : " + freq[i]);
			}
		}

		System.out.println("------------Another Way Using Hashmap---------------");

		Map<Integer, Integer> freqmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!freqmap.containsKey(arr[i])) {
				freqmap.put(arr[i], 1);

			} else {

				Integer count = freqmap.get(arr[i]);
				freqmap.put(arr[i], count + 1);

			}

		}
		
		System.out.println(freqmap);

	}

}
