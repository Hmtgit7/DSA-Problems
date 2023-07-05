//// AGE LIMIT PROBLEM CODECHEF

import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int N=read.nextInt();
        while(N>0){
            int X=read.nextInt();
            int Y=read.nextInt();
            int A= read.nextInt();
            if(A>=X && A<Y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            N--;
        }
        read.close();
    }
}
