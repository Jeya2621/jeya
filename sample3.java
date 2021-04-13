package sample;
import java.util.*;

public class sample3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num % 2 == 0)
		{
				System.out.println("Even");
		}
		else
		{
				System.out.println("Odd");
		}
			
		if(num >= 90 && num <= 100)
		{
				System.out.println("Excellent");
		}
		else if(num >= 70 && num < 90)
		{
				System.out.println("Very Good");
		}
		else if(num >= 50 && num < 70)
		{
				System.out.println("Good");
		}
		else
		{
				System.out.println("Need to Improve");
		}
	}

}
