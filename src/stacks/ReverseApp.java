package stacks;
import java.util.*;

public class ReverseApp {
	public static void main (String [] args)
	{
		String input, output;
		
		System.out.println("Enter a word to see it get reversed!");
		
		
		Scanner keyboard = new Scanner(System.in);
		
		input = keyboard.nextLine();
		
		keyboard.close();
		
		Reverse rev = new Reverse(input);
		
		output = rev.doRev();
		
		System.out.println("Reversed: " + output);;
		
		
	}
}
