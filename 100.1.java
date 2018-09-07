import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int product=1;
		while(n>0)
		{
			product*=n%10;
			n/=10;
		}
		System.out.println(product);
		s.close();
	}
}

	
