/* YiwenChuAssignment3.java
 * Author: Yiwen Chu
 * Date: March 11, 2021 
 
 * Description: Salary calculation for 3 different types of employees.
 */
package exercise.assignment;

import java.util.Scanner;

public class YiwenChuAssignment3 {
	
	// Fixed number for weekly wage calculation from yearly. 
	public static final int WEEK_IN_A_YEAR= 50; 
	// Pay per unit for contract employee. 
	public static final double PAY_PER_UNIT= 0.25;
	// Scanner for keyboard input
	private static Scanner input; 
	private static double weeklyWage;
	private static double bonus;

	public static void main(String[] args) {
		
		input = new Scanner(System.in); // Initialize scanner.
		
		int empType = confirmEmpType();
		
		calEmpSalary(empType);
		
		askBonus();
		
		printDetailPay();
	}
	
	// Show menu of employee types and ask for the employee type.
	public static int confirmEmpType () {
		
		System.out.printf("===========================%n"
				+ "Type of Employee:%n"
				+ "%4s1. Salaried Employee%n"
				+ "%4s2. Hourly Employee%n"
				+ "%4s3. Contract Employee%n"
				+ "===========================%n"
				+ "%-22s",
				"","","", "Enter employee type:");
		
		// Ask for employee type. 
		return input.nextInt();
	}
	
	// Execute salary calculation according to employee type. 
	public static void calEmpSalary(int empType) {
		
		// Call different method by employee type.
		switch(empType) {
			case 1: weeklyWage = calSalariedPay();
				break;
			case 2: weeklyWage = calHourlyPay();
				break;
			case 3: weeklyWage = calContractPay();
				break;
			default:
				// Show alert and exit program if the input type is invalid. 
				System.out.println("Error! Invalid employee type. "
						+ "Must be 1, 2 or 3");
				System.exit(1);
		}
		
	}
	
	// Weekly salary calculation for employee receiving yearly pay. 
	public static double calSalariedPay() {
		
		// Ask for yearly pay.
		System.out.printf("%-22s","Enter salary:");
		double annualWage = input.nextDouble();
		
		return annualWage/WEEK_IN_A_YEAR;		
	}
	
	// Weekly salary calculation for employee receiving hourly pay.
	public static double calHourlyPay() {
		
		// Ask for hourly pay.
		System.out.printf("%-22s","Enter hours worked:");
		double hourlyWage = input.nextDouble(); 
		
		// Ask for hourly rate.
		System.out.printf("%-22s","Enter hourly rate :");
		double hourlyRate = input.nextDouble();
		
		return hourlyWage*hourlyRate;
	}

	// Weekly salary calculation for contract employee.
	public static double calContractPay() {
		
		// Ask for complete unit.
		System.out.printf("%-22s","Number of units:");
		int totalUnit = input.nextInt(); 
		
		return totalUnit*PAY_PER_UNIT;
	}
	
	// Ask if the bonus exists and input it.
	public static void askBonus() {
		System.out.printf("%-22s","Bonus? (Y/N)");
		String hasBonus = input.next();
		bonus = 0;
		
		if( (hasBonus != null)? hasBonus.equalsIgnoreCase("Y"):false ) {
			System.out.printf("%-22s", "Bonus amount:");
			bonus = input.nextDouble();
			bonus = (bonus < 0)? 0: bonus;
		} 
	}
	
	// Print out the payment detail.
	public static void printDetailPay() {
		
		System.out.printf("%-11s$%7.2f%n", "Pay:", weeklyWage);
		System.out.printf("%-11s$%7.2f%n", "Bonus:", bonus);
		System.out.printf("%-11s$%7.2f%n", "Total Pay:", weeklyWage+bonus);
	}
}
