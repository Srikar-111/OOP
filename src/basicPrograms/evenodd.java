package basicPrograms;
import java.util.Scanner;


public class evenodd {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int num = obj.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		

	}

}
