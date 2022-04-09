/* YiwenChuAssignment4.java
 * Author: Yiwen Chu
 * Date: March 31, 2021 
 
 * Description: Interest calculation for multiple accounts input by users.
 */
package exercise.assignment;

import java.util.Scanner;

public class YiwenChuAssignment4 {
	
	// The interest per year
	public static final double INTEREST_RATE = 0.02;
	public static final int MONTH_IN_A_YEAR = 12;
	
	// Scanner for keyboard input
	private static Scanner input; 

	public static void main(String[] args) {

		// Ask the user for account balance as an array.
		double[] balanceList = extractBalanceList();
		
		// calculate monthly interest for each account and return as an array. 
		double[] interestList = calInterests(balanceList);
		
		// Print out the detail for each account.
		printAccountDetail(balanceList, interestList);
	}
	
	/* Calculate the monthly interest from balance for each account 
	 * and return as double array.*/ 
	public static double[] calInterests(double[] balanceList) {
		
		double[] interestList = new double[balanceList.length];
		
		for (int i = 0; i < balanceList.length; i++ ) {
			// monthly interest = balance * interest rate / month in a year
			interestList[i] = balanceList[i] * INTEREST_RATE / MONTH_IN_A_YEAR; 
		}
		
		return interestList;
	}
	
	// Get input balance list as double array. 
	public static double[] extractBalanceList() {
		
		System.out.printf("%-43s", 
				"Enter account balances separated by space:");
		
		double[] balanceList = null;
		
		try {
			// Initialize the scanner;
			input = new Scanner(System.in);
			
			String inputStr = input.nextLine();
			// Split input string by blank.
			String[] balanceStrArr = inputStr.split("\\s+");
			
			// Transfer input string array to double array.
			balanceList = new double[balanceStrArr.length];
			for(int i = 0; i < balanceStrArr.length; i++) {
				balanceList[i] = Double.parseDouble(balanceStrArr[i]);
			}
		} finally {
			input.close();
		}
		
		return balanceList;
	}

	// Method for print detail of account as list.
	public static void printAccountDetail(
			double[] balanceList, double[] interestList) {
		
		//Print the header row.
		System.out.printf("%-15s%-12s%s%n", "Account", "Balance", "Interest");
		System.out.printf("%s%n", "-------------------------------------");
		
		//Print the list of balance and interest.
		for (int i = 0; i < balanceList.length; i++) {
			System.out.printf("Account: %-5d %,.2f %9.2f%n", 
					i+1, balanceList[i], interestList[i]);
		}
	}
}
