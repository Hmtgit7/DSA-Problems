/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReachHome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		while(n>0){
		    int X=read.nextInt();
		    int Y=read.nextInt();
		    if(X*5>=Y) System.out.println("YES");
		    else System.out.println("NO");
		    --n;
		}
		read.close();
	}
}
