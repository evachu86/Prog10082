package exercise.incourse;

public class Exercise20210311 {

	public static void main(String[] args) {
		
		ifAlertCondition();
		switchWithoutBreak();
	}

	
	public static void ifAlertCondition() {
		
		double grade = 85;
		String letter = null;
		
		if (grade < 50) { 
		    letter = "F"; 
		} else if (grade >= 50) { 
		    letter = "D"; 
		} else if (grade >= 60) { 
		    letter = "C"; 
		} else if (grade >= 65) { 
		    letter = "C+"; 
		} else if (grade >= 70) { 
		    letter = "B"; 
		} else if (grade >= 75) { 
		    letter = "B+"; 
		} else if (grade >= 80) { 
		    letter = "A"; 
		} else if (grade >= 90) { 
		    letter = "A+"; 
		}
		
		System.out.println("Grade is "+letter);
	}
	
	public static void switchWithoutBreak() {
		int day = 2;
		
		switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:	System.out.println("Weekday!");
				break;
			case 0:
			case 6: System.out.println("Weekend!");
		}
		
	}
}
