package Logicals;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Coeffient of a");

		double a = sc.nextDouble();

		System.out.println("Enter the Coeffient of b");

		double b = sc.nextDouble();

		System.out.println("Enter the Coeffient of c");

		double c = sc.nextDouble();

		double delta = b * b - 4 * a * c;
		
		System.out.println("Delta :" + delta);

		if (delta > 0) {

			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / 2 * a;

			System.out.println("Root1 : " + root1);
			System.out.println("Root2 : " + root2);

		} else if (delta == 0) {

			double root = -b + 2 * a;

			System.out.println("Both roots are Equals : " + root);

		} else {

			double real = -b / (2 * a);
			double imagnary = Math.sqrt(-delta) / (2 * a);

			System.out.println("Root1 : " + real + " + " + imagnary + " i");
			System.out.println("Root2 : " + real + " - " + imagnary + " i");

		}

	}

}
