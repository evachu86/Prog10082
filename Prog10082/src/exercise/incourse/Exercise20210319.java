package exercise.incourse;

import java.util.Arrays;
import java.util.Scanner;


public class Exercise20210319 {

	private static Scanner input;

	public static void main(String[] args) {

		
//		ex_8_12();
//		modifySentence();
//		ex_8_15();
		System.out.println("welcome to java".indexOf("e", 1));
		System.out.println("welcome to java".lastIndexOf("e", 6));
	}

	public static void ex_8_12() {

		int[] values = new int[10];
		int counter = 1;
		values[0] = 10;
		values[counter] = counter;
		counter++;
		values[5] = counter;
		values[9] = values[5] + counter;
		values[counter] = values[9] - values[1];
		values[9] += ++counter;
		
		for(int value: values) {
			System.out.print(value + " ");
		}
	}
	
	public static void ex_8_15() {
		
		input = (input == null)?new Scanner(System.in): input;
		int[] intArr = new int[10];
		int summary = 0;
				
		for(int i = 0; i< intArr.length; i++) {
			System.out.println("Please enter 10 integer, "
					+ "the " +(i+1)+ " interger is:");
			intArr[i] = input.nextInt();
			summary += intArr[i];
		}
		
		Arrays.sort(intArr);
		
		// without Arrays method:
		int highest = 0, lowest = 0;
		for(int intEle: intArr) {
			highest = (intEle > highest)? intEle: highest;
			lowest = (intEle < lowest)? intEle: lowest;
		}
		
		System.out.printf("%-20s %7.2f%n", 
				"The Average:", (double)summary/intArr.length);
		System.out.printf("%-20s %4d%n", 
				"The highest value:", intArr[intArr.length-1]);
		System.out.printf("%-20s %4d%n", 
				"The lowest value:", intArr[0]);
		
		System.out.println("");
		
		System.out.printf("%-20s %4d%n", 
				"The highest value:", highest);
		System.out.printf("%-20s %4d%n", 
				"The lowest value:", lowest);
		
	}
	
	public static void modifySentence() {
		
		input = new Scanner(System.in);
		
		System.out.println("Please enter a sentence:");
		String sentenceStr = input.nextLine();
		
		char[] sentenceCharArr = sentenceStr.toCharArray();
//		char[] sentenceCharArr = new char[sentenceStr.length()];
		
		System.out.print(
				"Please enter the sequence number of the character "
				+ "you want to replace, \n"
				+ "and the character you d like to replace for. \n"
				+ "Please enter the format like "
				+ "[no. of sequence] [replacing char]:\n"
				+ "(If replacing enter more than one character, \n"
				+ "only the first charcater will be used.)");
		int sequence = input.nextInt();
		String replacingChar = input.next();
		
		sentenceCharArr[sequence-1] = replacingChar.charAt(0);
		
		for(char charEle: sentenceCharArr) {
			System.out.print(charEle);
		}
	}
}
