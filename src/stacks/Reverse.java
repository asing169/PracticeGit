package stacks;

public class Reverse {
	private String input;
	private String output;
	
	public Reverse(String in)
	{
		input = in;
	}
	
	public String doRev()
	{
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		for(int i = 0; i < input.length();i++)
		{
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		output="";
		while( !theStack.isEmpty())
		{
			char ch = theStack.pop();
			output = output + ch;
		}
		
		return output;
	}
}
