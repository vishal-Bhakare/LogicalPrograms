package Logicals;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the harmonic value N (N > 0): ");
        int N = sc.nextInt();
        
        // Ensure that N is greater than 0
        if (N <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        // Initialize the harmonic sum
        double harmonicSum = 0.0;

        // Compute the harmonic sum: 1/1 + 1/2 + ... + 1/N
        for (int i = 1; i <= N; i++) {
            harmonicSum += 1.0 / i;
        }

        // Output the result
        System.out.println("The " + N + "th Harmonic Value is: " + harmonicSum);
    }
}

