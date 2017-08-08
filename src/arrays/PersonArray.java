package arrays;

public class PersonArray {
	private Person[] a;
	private int numOfEl;
	
	public PersonArray(int size)
	{	
		a = new Person[size];
		numOfEl = 0;
		
	}
	
	//put person into array
	
	public void insert(String last, String first, int age)
	{
		a[numOfEl] = new Person(last, first, age);
		numOfEl++;
		
		
	}
	
	//delete person and move down the elements to fill gap.
	public boolean delete(String searchLast)
	{
		int i;
		for(i = 0; i < numOfEl; i++)
			if( a[i].getLast().equals(searchLast))
				break;
		    
			
			if( numOfEl == i)
				return false;
			
			else
			{
				for(int j = i; j < numOfEl; j++)
					a[j] = a[j+1];
				
				numOfEl --;
				return true;
			}
	
	}
	
	//search for person
	public Person find(String searchLast)
	{
		int i;
		for(i = 0; i < numOfEl; i++)
			if( a[i].getLast().equals(searchLast))
				break;
		    
			
			if( numOfEl == i)
				return null;
			
			else
				return a[i];
		
		
	}
	
	//display contents of array
	public void displayArray()
	{
		for(int i = 0; i < numOfEl; i++)
			a[i].displayPerson();
	}
	
}
