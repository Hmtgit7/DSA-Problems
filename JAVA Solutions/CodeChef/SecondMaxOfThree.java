import java.util.Scanner;

public class SecondMaxOfThree {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int N=read.nextInt();
		while(N>0){
		    int A=read.nextInt();
		    int B=read.nextInt();
		    int C=read.nextInt();
		    if(A>=B && A<C ||A>=C && A<B)
		    {
		        System.out.println(A);
		    }
		    if(B>=C && B<A ||B>=A && B<C)
		    {
		        System.out.println(B);
		    }
		    if(C>=B && C<A || C>=A && C<B)
		    {
		        System.out.println(C);
		    }
		    
		    --N;
		}
	}
}
