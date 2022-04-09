package exercise.incourse;

public class Exercise20210205 {

	public static void main(String[] args) {
		demonstrateMath();
		
		demonstratePrintf();
		
		demonstrateChar();
	}
	
	public static void demonstrateMath() {
		// Ans. is 0.5
		// printed double is approximate number = 0.5
		double approximateNum = Math.sin(Math.PI / 6.0);
		System.out.println("approximateNum: " + approximateNum);

		// notice the return type.
		long roundLong = Math.round(2.4); // input double
		int roundInt = Math.round(2.4F); // input float

		// compare round() & rint()
		long roundNum = Math.round(2.5);
		double rindNum = Math.rint(2.5);
		double rindNum2_51 = Math.rint(2.51);
		System.out.println("roundNum = " + roundNum);
		System.out.println("rindNum = " + rindNum);
		System.out.println("rindNum2_51 = " + rindNum2_51);

		// Math.random() return double between 0.0 - 1.0
		// never show 7 below.
		System.out.println("Math.random() return = " 
				+ (int) (Math.random() * 7));
	}
	
	public static void demonstratePrintf() {
		
		// %f will automatically round.
		System.out.printf("2 floating of PI print: %.2f%n", Math.PI);
		System.out.printf("4 floating of PI print: %.4f%n", Math.PI);
		
		// left number of point in %f 
		// mean the total length of shown number, including point 
		System.out.printf("4 floating of PI print: %10.4f%n", Math.PI);
		
		// money
		System.out.printf("Money format of 123456.456: $%,4.2f%n", 123456.456);
		
		//fill the blank with 0
		System.out.printf("Money format of 123456.456 with 0: $%0,20.2f%n", 123456.456);
		
		// scientific notation
		System.out.printf("flag e for PI print: %.3e%n", Math.PI);
	}

	public static void demonstrateChar() {
		// print ASCII code 
		char letter = 'A';
		System.out.print("Automatically conversion of char through plus number: ");
		System.out.println(letter+1);
		int convLetter = letter;
		System.out.print("Automatically conversion of char: ");
		System.out.println(convLetter);
		
		// Unicode
		char uniLetter = '\u0041';
		System.out.print("Unicode of char: "+uniLetter);
	}
}
