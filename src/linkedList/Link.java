package linkedList;

public class Link {
 
	public int data;
	public Link next;
	
	public Link(int dataInput)
	{
		
		data = dataInput;
		next = null;
		//next automatically gets initialized
		
	}
	
	public void display()
	{
		System.out.println(data);
	}
	
	
	
	
}
