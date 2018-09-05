import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=0,y=0;
        for(int i=1;i<=n && i<=m;i++)
        {
            if(n%i==0 && m%i==0)
            {
                x=i;
            }
        }
        y=(n*m)/x;
        System.out.print(y);
    }
}
	
