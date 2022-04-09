package exercise.incourse;

public class Exercise20210325 {

	public static void main(String[] args) {
		
		showCompare();
	}
	
	public static void showCompare() {
	
		System.out.println("a".compareTo("A"));
		System.out.println("h".compareTo("H"));
		System.out.println("happy".compareTo("HAPPY"));
		System.out.println(" ".compareTo(""));
		System.out.println("sweet".compareTo("sweet-tooth"));
		System.out.println(('o'-'e') +" " +("one".compareTo("eighty")));
	}
}

