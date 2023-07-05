// GOOD TURN PROBLEM CODECHEF

import java.util.Scanner;

public class GoodTurn {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int N=read.nextInt();
        while(N>0){
            int X=read.nextInt();
            int Y=read.nextInt();
            if((X+Y)>6){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
