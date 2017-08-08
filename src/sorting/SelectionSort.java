package sorting;

public class SelectionSort {
	
		public static void main(String[] args)
		{
			int [] array = {0,4,2,44,3,6,2,1};
			int temp = 0;
			int minIndex=0;
			
			for(int i = 0; i<array.length - 1 ; i++)
			{
				
				minIndex = i;
				
				for(int j = i + 1; j < array.length; j++) //finds smallest value
				{
					if(array[j] < array[minIndex])
						 minIndex = j;
 						
					}
				
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				
					
				}
			
			
							
			
			
			
			
		
			
			for(int k = 0;k<array.length;k++)
			{
				System.out.println(array[k]);
			}
	}
		}

