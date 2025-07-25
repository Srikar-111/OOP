package task1_practical;

public class TypeConversion {

	public static void main(String[] args) {
		// Implicit Conversion
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
