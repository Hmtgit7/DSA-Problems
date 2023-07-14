/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public class TheCheaperCab {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner read=new Scanner(System.in);
        int N=read.nextInt();
        while(N>0){
            int X=read.nextInt();
            int Y=read.nextInt();
            if(X<Y) System.out.println("FIRST");
            else if(X>Y) System.out.println("SECOND");
            else System.out.println("ANY");
            --N;
        }
        read.close();
	}
}
