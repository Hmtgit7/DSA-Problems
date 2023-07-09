/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RightThere
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		while(n>0){
		    int N=read.nextInt();
		    int X=read.nextInt();
		    if(N>X) System.out.println("NO");
		    else System.out.println("YES");
		    --n;
		}
	}
}
