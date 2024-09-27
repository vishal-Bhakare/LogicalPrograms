package Logicals;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temperature upto 50 f");

		double t = sc.nextDouble();

		System.out.println("Enter the wind speed upto 3 to 120 ");

		double v = sc.nextDouble();

		if (t > 50) {

			System.out.println("Invalid : Please Enter the temperature upto 50 f");

			return;
		}

		if (v < 3 || v > 120) {

			System.out.println("Invalid : Enter the wind speed upto 3 to 120");
			return;
		}

		double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

		System.out.println("The wind chill is : " + windChill);
	}

}
