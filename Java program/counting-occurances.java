import java.util.scanner;

public class co {
	public static void main(String[][] args) {
		int n=45536;;
		count =0;
		while(n>0)
		{
			rem=n%10;
			if(rem==6)
				count++;
		}
		n=n/10;
	}
	system.out.println(count);
}