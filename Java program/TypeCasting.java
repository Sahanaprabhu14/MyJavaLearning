import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* Conditions for TypeConversion(One type of data is assigned to another type of data)
		1. Two types should be compatible 
		2. Destination type should be greater than the source type
		*/

		//The below code works
		float num = input.nextInt();
		System.out.println(num);

		//The below code doesn't work, gives error (destination type is smaller than source type i.e int<float)
		/* 
		int num = input.nextFloat();
		System.out.println(num);
		*/

		

	}
}