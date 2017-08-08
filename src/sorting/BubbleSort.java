package sorting;

public class BubbleSort {
	public static void main(String[] args)
	{
		int [] a = new int [5];
		a[0]=10;
		a[1]=66;
		a[2]=3;
		a[3]=1;
		a[4]=43;
		int size = a.length;
		System.out.println(size);
		int temp = 0;
		for(int i = a.length - 1; i > 1 ; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j + 1] = temp;
				}
				
			}
			
		}
		
		for(int k = 0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
	}
}





