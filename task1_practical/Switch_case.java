package task1_practical;
import java.util.*;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		char grade = obj.next().charAt(0);
		
		switch(grade) {
		case 'O':
			System.out.println("Outstanding");
			break;
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		default:
			System.out.println("Invalid Grade");
		}

	}

}
