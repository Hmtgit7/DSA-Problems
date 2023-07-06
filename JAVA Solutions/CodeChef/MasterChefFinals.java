import java.util.Scanner;

public class MasterChefFinals {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        while (n > 0) {
            int rank = read.nextInt();
            if (rank > 10)
                System.out.println("NO");
            else
                System.out.println("YES");
            n--;
        }
        read.close();

    }
}