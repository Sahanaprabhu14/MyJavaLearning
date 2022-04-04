import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your roll number:");
		int rollno = input.nextInt();
		System.out.println("Your Roll no is" + rollno);

		System.out.print("Enter your name:");
		String name = input.next();
		System.out.println("Your name is" + name);

		System.out.print("Enter your marks:");
		float marks = input.nextFloat();
		System.out.println("Your marks is:" + marks);
	}
}