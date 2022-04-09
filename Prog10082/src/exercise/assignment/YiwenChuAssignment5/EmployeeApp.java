/* EmployeeApp.java
 * Author: Yiwen Chu
 * Date: April 7, 2021 
 
 * Description: test app for Employee class.
 */
package exercise.assignment.YiwenChuAssignment5;

import java.util.Scanner;

public class EmployeeApp {
	
	private static Scanner input;

	public static void main(String[] args) {

		try {
			input = new Scanner(System.in);
			
			testEmployee(input);
			
			// insert 2 line for separation of tests.
			// wipe newline for scanner.
			System.out.println("\n");
			input.nextLine();
			
			testEmployeeWithParams(input);
			
		} catch(Exception e) {
			if(e.getMessage() != null)
				System.out.println(e.getMessage());
			else
				System.out.println("Error: non-numeric values are not valid");
		} finally {
			input.close();
		}
	}
	
	// Method for test employee constructor without parameters.
	public static void testEmployee(Scanner input) throws Exception {
		
		// Initialize employee class by the constructor 
		// without parameters input.
		Employee emp = new Employee();
		
		showMsg("Enter employee name:");
		emp.setName(input.nextLine());
		
		showMsg("Enter employe position:");
		emp.setPosition(input.nextLine());
		
		showMsg("Enter hours worked:");
		emp.setHoursWorked(input.nextDouble());
		
		showMsg("Enter hourly rate:");
		emp.setHourlyRate(input.nextDouble());
		
		// Show the employee detail according to input.
		System.out.println(emp.toString());
	}

	// Method for test employee constructor with parameters.
	public static void testEmployeeWithParams(Scanner input) throws Exception {
		
		showMsg("Enter employee name:");
		String empName = input.nextLine();
		
		showMsg("Enter employe position:");
		String empPosition = input.nextLine();
		
		//Initialize Employee class by the constructor with parameters.
		Employee emp = new Employee(empName, empPosition);

		showMsg("Enter hours worked:");
		double empWorkedHours = input.nextDouble();
		emp.setHoursWorked(empWorkedHours);
		
		showMsg("Enter hourly rate:");
		double empHourlyRate = input.nextDouble();
		emp.setHourlyRate(empHourlyRate);
		
		// Show the employee detail according to input.
		System.out.println(emp.toString());
	}
	
	// Show message in console in specific format: 26 characters aligned left.
	private static void showMsg(String msg) {
		
		System.out.printf("%-26s", msg);
	}
}
