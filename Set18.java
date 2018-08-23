/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set18
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a[]=new String[2];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		String s1=a[0];
		String s2=a[1];
System.out.print(s1.substring(0,1).toUpperCase()+""+s1.substring(1).toLowerCase()+" "+s2.substring(0,1).toUpperCase()+""+s2.substring(1).toLowerCase());
	}
}
