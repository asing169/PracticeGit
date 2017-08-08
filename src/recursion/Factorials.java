package recursion;

public class Factorials {
	
	public int fac(int n)
	{
		int result; 
		
		if(n == 0 || n==1)
			return 1;
		
		result = n * fac(n-1);
			return result;
	}
}
