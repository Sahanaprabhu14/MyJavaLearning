import java.util.Scanner;

public class counting_occurances {
	public static void main(String[] args) {
		int n=45536;
		int count =0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==6) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
	
}