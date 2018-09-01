import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int x=0;
        for(int i=0;i<s1.length;i++)
        {
            int m=Integer.valueOf(s1[i]);
            x=(int)Math.abs(x-m);
        }
        System.out.print(x);
    }
}
		
	
