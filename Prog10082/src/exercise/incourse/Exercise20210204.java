package exercise.incourse;

import java.util.Scanner;

public class Exercise20210204 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Please enter your first name:");
		String inputStopBySpace = input.next();
		System.out.println("Your first name is:"+inputStopBySpace);
		
		// input \s
		// then in put next full name.
		String test2 = input.next();
		System.out.println("Please enter your full name:");
		String inputStopByNewline = input.nextLine();
		// Only output last name
		System.out.println("Your full name is:"+inputStopByNewline);
		// Cause the \s was ignored, and the First name was read.
		System.out.println("test2:"+test2);
		
		// try input "3, 4.5"
		System.out.print("Please enter a double name:");
		double inputStopByDouble = input.nextDouble();
		System.out.println("You input the double:"+inputStopByDouble);
		
		String status = "It is foo";
		System.out.println(status.equals("foo"));
		System.out.println(status.contains("foo"));
		System.out.println(status.indexOf("foo") != -1);
	}

}
