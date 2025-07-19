package basicPrograms;
import java.util.Scanner;



public class Signcheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		if(num>0)
		{
			System.out.println("Postive");
		}
		else if(num==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negative");
		}
		
	}

}
