package linkedList;

public class LinkList {
	
	private Link first;
	
	public LinkList()
	{
		first = null;
	}
	
	//inserts new link to the front.
	public void Insert(int data1)    
	{
		Link newLink = new Link(data1);
		newLink.next = first;          // the next variable has the address of the old first element.
		first = newLink;			//the address of the new link is now stored in first.
	}
	
	//deletes link from the front.
	public void delete()
	{
		first = first.next;
	}
	
	public Link find(int key)
	{
		Link current = first;
		while(current.data != key )
		{
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		
		return current;
		
		
	}
	
	public Link deleteKey(int key)
	{
		Link current = first;
		Link previous = first;
		
		while(current.data != key)
		{
			if(current.next == null)
				return null;
			else
			{
				previous = current;
				current = current.next;
			}
		}
		
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		 
		return current;
	}
	
	public void DisplayList()
	{
		Link current = first;
		
		while (current.next != null)
		{
			current.display();
			
			current = current.next;
		}
	}
		
	}

