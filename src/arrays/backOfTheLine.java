package arrays;
//push the zeros to the back of the line.
public class backOfTheLine {

	public static void main (String [] args)
	{
		
	
	int [] a= {1,0,2,4,0,3,0,10,44,2,5,0};
		
	int pos = 0;
  	for(int i = 0; i < a.length; i++)  //pos keeps the place of the array when you find a zero. When the next non zero is found it is put in pos and then pos is incremented.
  		if(a[i] != 0)
  			
  		{
  			a[pos] = a[i];
  			pos++;
  		}
  	
  	
  	for(int i = pos; i < a.length; i++)
  		a[i] = 0;
  
		
	
	

	for(int p = 0; p<a.length;p++){
	System.out.println(a[p]);
}
}
}
