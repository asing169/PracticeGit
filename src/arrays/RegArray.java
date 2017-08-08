package arrays;

public class RegArray {

	public static void main (String[] args)
	{
		int [] array = new int [2];
		
		array[0] = 1;
		array[1] = 2;
		
		String [] arrayWrds = {"Hello", "World"};
		
		for(int i = 0; i < array.length; i++)
		System.out.println(array[i]);
		System.out.println(array.length);
		for(int j = 0; j < arrayWrds.length; j++)
			System.out.print(arrayWrds[j] + " ");
	}
}
