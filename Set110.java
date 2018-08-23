import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set110
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int l1=s1.length();
		int l2=s2.length();
		int d=0,i;
		for(i=0;i<l1;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				d=d+i;
			}
 
		}
		if(d!=0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
 
	}
}
