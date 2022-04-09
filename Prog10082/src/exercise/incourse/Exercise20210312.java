package exercise.incourse;

import java.util.Scanner;

public class Exercise20210312 {

	public static void main(String[] args) {

		System.out.printf("Print %% in the printf%n", "");

//		ex7_13_6();
//		ex7_14_2();
		ex_7_14_3();
//		askValidGrade();
//		ex7_18Investement();
	}

	public static void askValidGrade() {

		Scanner input = new Scanner(System.in);
		int grade = 0;

		do {
			System.out.print("Enter grade between 0 & 100: ");
			grade = input.nextInt();
		} while (grade < 0 || grade > 100);

		System.out.println("The grade is: " + grade);

	}

	public static void ex7_18Investement() {

		Scanner input = new Scanner(System.in);

		System.out.printf("%-36s", "Enter the investment amount:");
		double amount = input.nextDouble();

		System.out.printf("%-36s", "Enter the interest rate:");
		double rate = input.nextDouble() / 100;

		for (int i = 1; i <= 5; i++) {
			amount += amount * rate;
			System.out.printf("After year %d: $%4.2f%n", i, amount);
		}
	}

	public static void ex7_13_6() {
		int x = 1, y = 3;
		while (x < 5 || y > 0) {
			// be careful the pre-increment y.
			System.out.println(x++ + ", " + --y);
		}
		System.out.print("x: " + x);
		System.out.println(" y:" + y);
	}

	public static void ex7_14_2() {
		int count = 9;
		do {
			System.out.println(count);
			count--;
		} while (count <= 10 && count > 4);
		System.out.println(count);
	}

	public static void ex_7_14_3() {
		int count = 1;
		do {
			System.out.println(count);
			count--;
		} while (count > 1);
	}
}
