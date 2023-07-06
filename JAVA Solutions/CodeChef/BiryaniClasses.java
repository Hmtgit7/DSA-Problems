import java.util.Scanner;

public class BiryaniClasses {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        while (n > 0) {
            int X = read.nextInt();
            int Y = read.nextInt();
            int totalAmount = X * Y;
            System.out.println(totalAmount);
            --n;
        }
        read.close();
    }
}
