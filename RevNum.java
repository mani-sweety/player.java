import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RevNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num, rev=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);
	}
}
