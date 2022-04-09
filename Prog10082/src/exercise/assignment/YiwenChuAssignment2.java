/* YiwenChuAssignment2.java
 * Author: Yiwen Chu
 * Date: February 11, 2021 
 * 
 * Description: Calculate escape velocity by input circumference & 
 * the acceleration due to gravity at the planet's surface.
 */
package exercise.assignment;

import java.util.Scanner;

public class YiwenChuAssignment2 {

	// The gravitational constant
	public static final double CONST_G = 6.6726e-11;
	// Fixed output message for radius
	private static String outputR = "Radius of ";
	// Fixed output message for mass
	private static String outputM = "Mass of ";
	// Fixed output message for escape velocity
	private static String outputV = "Escape velocity of ";
	private static Scanner input;
	private static String planetName; // Planet's name
	private static double r; // radius
	private static float a; // acceleration
	private static double m; // mass
	private static double escV; // escape velocity

	public static void main(String[] args) {

		inputData();

		m = getMass();

		escV = getEscVelocity();

		outputFormatted();
	}

	// Calculate mass through input radius and acceleration.
	public static double getMass() {
		
		return (Math.pow(r, 2) * a) / CONST_G;
	}

	/**
	 * Calculate escape velocity through simplified formula.
	 * 
	 * The formula comes from combination of formula 
	 * calculating escape velocity and mass, then simplified.
	 */
	public static double getEscVelocity() {
		
		return Math.sqrt(2 * r * a);
	}

	// Ask the user to input data.
	public static void inputData() {

		input = new Scanner(System.in);

		// Ask for planet name.
		System.out.printf("Planet name:%36s", "");
		planetName = input.next();

		// Ask for planet's circumference.
		System.out.printf("Circumference (km) of planet?%19s", "");
		// Calculate the radius by the input circumference.
		// c = 2£kr ¡÷ r = c/2£k 
		r = input.nextInt() / (2 * Math.PI);   

		// Ask for the acceleration due to gravity at the planet's surface
		System.out.printf("Acceleration due to gravity (m/s^2) on planet?%2s", 
				"");
		a = input.nextFloat();
	}

	// output data in the specific format.
	public static void outputFormatted() {

		System.out.printf("%n");
		// Output message for the radius.
		System.out.printf("%s%s:%," + fillingSpaceNum(outputR) + ".1f%n", 
				outputR, planetName, r);
		// Output message for the mass.
		System.out.printf("%s%s:%" + fillingSpaceNum(outputM) + ".1e%n", 
				outputM, planetName, m);
		// Output message for the escape velocity.
		System.out.printf("%s%s:%" + fillingSpaceNum(outputV) + ".1f%n", 
				outputV, planetName, escV);
	}

	//
	/**
	 * Calculate how much space should be filled before output value. 
	 * 
	 * Number of filled space = 
	 * Max fixed message length + Max formatted value length 
	 * - Fixed output message + 1
	 */
	private static int fillingSpaceNum(String fixedMsg) {
		
		int maxStrLeng = Math.max(Math.max(outputR.length(), 
				outputM.length()), outputV.length());
		int maxValLeng = Math.max(Math.max(String.format("%,.1f", r).length(), 
				String.format("%.1e", m).length()),
				String.format("%.1f", escV).length());
		return (maxStrLeng + maxValLeng - fixedMsg.length()) + 1;
	}
}
