import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        int n=(int)Math.abs(a%b);
        int m=(int)Math.abs(a/b);
        System.out.println(m);
        System.out.println(n);
    }
}
		
	
