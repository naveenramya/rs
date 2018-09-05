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
        int flag=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
