package basicPrograms;

public class Typecasting {

	public static void main(String[] args) {
		//implict typecasting
		int number = 100;
		long longnumber;
		
		longnumber = number;
		
		System.out.println("Integer Value "+ number);
		System.out.println("Long value after typecasting "+ longnumber);
		
		//explict typecasting
		double decimal = 9.78;
		int wholenum;
		char c = 'A';
		
		wholenum = (int)decimal;

		
		System.out.println("Double value "+ decimal );
		System.out.println("Integer value after typecasting "+ wholenum);
		System.out.println("Character " + (int)c);

	}

}
