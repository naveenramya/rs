import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
        String ip=a.nextLine();
        int len=ip.length();
        int mid=len/2;
        char[] x=ip.toCharArray();
        if(len%2==1)
        {
            x[mid]='*';
            
        }
        else
        {
            x[mid]='*';
            x[mid-1]='*';
        }
        System.out.println(x);
    }
}
	
