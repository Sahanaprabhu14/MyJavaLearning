
//Scanner is a class that allows us to take input and located in java.util package
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //standard output stream
        System.out.println("Hello World!");
        //standard input stream (keyboard input)
        Scanner input = new Scanner(System.in);
        //Prints the next integer Note: You can only pass integer
        System.out.println(input.nextInt());
        // Comment the above line to see the changes of below line
        //Prints a line( It can be integer, string or of any datatype)
        System.out.println(input.nextLine());

    }
}
