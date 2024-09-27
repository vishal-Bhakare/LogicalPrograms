package Logicals;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class SumOfThreeIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of integers
        System.out.println("Enter the number of integers (N): ");
        int N = sc.nextInt();

        // Input: Array of integers
        int[] arr = new int[N];
        System.out.println("Enter " + N + " integers: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Set to hold distinct triplets
        Set<String> triplets = new HashSet<>();
        int count = 0;

        // Logic: Find distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        // Sort the triplet to avoid duplicates
                        int[] triplet = {arr[i], arr[j], arr[k]};
                        java.util.Arrays.sort(triplet);
                        String tripletKey = triplet[0] + "," + triplet[1] + "," + triplet[2];

                        if (triplets.add(tripletKey)) {
                            count++;
                        }
                    }
                }
            }
        }

        // Output: Number of distinct triplets
        System.out.println("Number of distinct triplets that sum to zero: " + count);

        // Output: Print the distinct triplets
        System.out.println("Distinct triplets that sum to zero:");
        for (String key : triplets) {
            System.out.println(key);
        }

        sc.close(); // Close the Scanner object
    }
}

