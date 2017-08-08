package sorting;

public class InsertionSort {

	public static void main(String[] args)
	{
		int a [] = {66,9,0,52,6}; //{9,66,0,52,6}
		int j;
		int key;
		
		for(int i = 1; i < a.length; i++)
		{
			key = a[i];
			j=i-1;
		
			while(j >= 0 && key<a[j])
				
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				j--;
			}
		}
		
		for(int k = 0; k < a.length; k++)
			System.out.println(a[k]);
	}
}