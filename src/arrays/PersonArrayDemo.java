package arrays;

public class PersonArrayDemo {

	public static void main (String [] args)
	{
		PersonArray a1 = new PersonArray(10);
		
		a1.insert("Singh","Amneet",10);
		a1.insert("Brar", "Amandeep", 30);
		a1.insert("Bains","Navdeep",60);
		
		a1.delete("Brar");
		
		a1.displayArray();
	}
	
}
