import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set35
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			String[] c=new String[10];
		String temp="";
		Scanner sc=new Scanner(System.in);
		 int k=sc.nextInt();
		for(int i=0;i<k;i++){
		c[i]=sc.next();
		}
		for(int i=0;i<k;i++){
 
		for(int j=i+1;j<k;j++){
			if(c[i].length()>=c[j].length()){
			if(c[i].compareTo(c[j])>0){
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
			else{
				temp=c[j];
				c[j]=c[i];
				c[i]=temp;
			}
		}
 
		}
		}
		for(int i=0;i<k;i++){
			for(int j=0;j<c[i].length();j++){
				char[] a=new char[10];
				a=c[i].toCharArray();
		Arrays.sort(a);
		if(i==0)
		System.out.print(a);
		else{
		System.out.print(" ");
		System.out.print(a);
		}
		break;
			}
		}
	}
}
