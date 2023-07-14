/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RatingImprovement {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner read= new Scanner(System.in);
        int N=read.nextInt();
        while(N>0){
            int X=read.nextInt();
            int Y=read.nextInt();
            int result=Y-X;
            if(result<200) System.out.println("YES");
            else System.out.println("NO");
            --N;
        }
        read.close();
	}
}
