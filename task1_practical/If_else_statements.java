package task1_practical;
import java.util.*;

public class If_else_statements {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int marks = obj.nextInt();
		
		if(marks > 90) {
			System.out.println("A Grade");
		}
		else if(marks>75 && marks<90) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("C Grade");
		}

	}

}
