package Logicals;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Divedent");

		double devedent = sc.nextDouble();

		System.out.println("Enter the Divisor");

		double devisor = sc.nextDouble();

		if (devisor == 0) {

			System.out.println("Divisor Cant be zero, Pelese Enter Non Zero value ");

			return;
		}

		double quotient = devedent / devisor;
		double remainder = devedent % devisor;
		
		System.out.println("The Quotient of the "+devedent + " is : "+quotient);
		System.out.println("The Remainder of the "+devedent + " is : "+remainder);

	}
}
