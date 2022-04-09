package exercise.incourse;

import java.util.Scanner;

public class Exercise20210318 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("%-28s", "Enter the starting temperature: ");
		int start = input.nextInt();

		System.out.printf("%-28s", "Enter the ending temperature: ");
		int end = input.nextInt();

		double celcius;

//print header
		System.out.println("Temperature Conversion");
		System.out.printf("%-12s%-12s%n-----------------------%n", "Farenheit", "Celcius");

		if (start > end) {

//display in descending order
			for (int i = start; i >= end; i--) {
				celcius = (5.0 / 9.0) * (i - 32);
				System.out.printf("%8.2f %8.2f%n", (double) i, celcius);
			}

		} else {

//display is ascending order
			for (int i = start; i <= end; i++) {
				celcius = (5.0 / 9.0) * (i - 32);
				System.out.printf("%8.2f %8.2f%n", (double) i, celcius);
			}
		}

	}
}