import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
             factorial = factorial * i;
            
        }
        System.out.println(factorial);
	}
}
