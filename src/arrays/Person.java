package arrays;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	
public Person(String last, String first, int a)
{
	firstName = first;
	lastName = last;
	age = a;
}

public void displayPerson()
{
	System.out.println("last name: " + lastName);
	System.out.println("first name: " + firstName);
	System.out.println("Age: " + age);
	
}

public String getLast()
{
	return lastName;
}
}
