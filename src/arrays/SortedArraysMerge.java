package arrays;

public class SortedArraysMerge {
	
	public static void main (String [] args)
	{
		int array1 [] = {1,4,5,12,56};
		int array2 [] = {2,6,32,71};
		
		int answer [] = new int [array1.length + array2.length];
		
		int i = 0, j = 0, k = 0;
	    while (i < array1.length && j < array2.length)
	    {
	        if (array1[i] < array2[j])
	        {
	            answer[k] = array1[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = array2[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < array1.length)
	    {
	        answer[k] = array1[i];
	        i++;
	        k++;
	    }

	    while (j < array2.length)
	    {
	        answer[k] = array2[j];
	        j++;
	        k++;
	    }
		
	    for(int v =0; v < answer.length; v++)
	    {
	    	System.out.println(answer[v]);
	    }
	}

}
