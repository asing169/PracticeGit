package strings;
import java.util.*;

public class RemoveWhiteSpace {
	

		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a string and watch me remove extra spaces!");
			String input = keyboard.nextLine();
			
			String outcome = input.trim().replaceAll(" +"," ");
			System.out.println(outcome);
			
		}
	}

