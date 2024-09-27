package Logicals;

import java.util.Random;
import java.util.Scanner;

public class PercentageOfHeadAndTails {

    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of flips:");

        int flips = sc.nextInt(); 

        // Check if the input is non-negative
        if (flips <= 0) {
            System.out.println("Enter a positive number");
            return;  // Exit the program if input is invalid
        }

        // Create a Random object to generate random numbers
        Random ran = new Random();

        // Initialize counters for heads and tails
        int tailsCount = 0;
        int headCount = 0;

        // Loop for each flip
        for (int i = 0; i < flips; i++) {
            // Generate a random number between 0.0 and 1.0
            double flipResult = ran.nextDouble();  // Use Random class to generate random double
            
            // Check the condition: if less than 0.5, it's a tail; otherwise, it's a head
            if (flipResult < 0.5) {
                tailsCount++;
            } else {
                headCount++;
            }
        }

        // Calculate the percentage for heads and tails
        double tailPercentage = (double) tailsCount / flips * 100;
        double headPercentage = (double) headCount / flips * 100;

      
        System.out.println("Tails Count: " + tailsCount);
        System.out.println("Heads Count: " + headCount);
        System.out.println("Percentage of Tails: " + tailPercentage + " %");
        System.out.println("Percentage of Heads: " + headPercentage + " %");
    }
}
