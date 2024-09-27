package Arrays;

import java.util.Scanner;

public class Even_Postion_Array {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println("Enter the Array "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0 ;i<arr.length;i +=2) {
			
			System.out.println("Even Position " + i + " Arrays is :"+arr[i]);
		}
		
	}

}
