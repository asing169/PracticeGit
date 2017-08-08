package strings;
import java.util.Scanner;

public class reverseString {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string and watch me reverse it!");
		String input = keyboard.nextLine();
		int length = input.length();
		String outcome = "";
		
		for(int i = input.length()-1; i >= 0 ;i--)
		{
			outcome = outcome + input.charAt(i);
		}
		
		System.out.println(outcome);
		System.out.println(length);
	}
}
 //" Happy Birthday  Broksi "