import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set19
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		int n,i,count=0;
		for(n=low;n<=high;n++)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					break;
				}
			}
			if(n==i)
			{
				count++;
			}
		}
System.out.print(count);
	}
}
