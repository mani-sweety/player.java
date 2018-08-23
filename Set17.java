import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set17
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char t;
		char a[]=s1.toCharArray();
		int l=s1.length();
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				t=a[i];
				a[i]=a[i-1];
				a[i-1]=t;
			}
		}
		for(int i=0;i<a.length;i++)
 
System.out.print(a[i]);
	}
}
