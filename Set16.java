import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set16
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int m=0,k=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					m=i;
					k=j;
				}
				
			}
		}
		if(s2.charAt(m)==s2.charAt(k))
		{
			System.out.println("yes");
			//break;
		}
		else
		{
			System.out.println("no");
			//break;
}
	}
}
