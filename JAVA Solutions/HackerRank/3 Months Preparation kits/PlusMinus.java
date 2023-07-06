
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// class Result {

//     /*
//      * Complete the 'plusMinus' function below.
//      *
//      * The function accepts INTEGER_ARRAY arr as parameter.
//      */

//     public static void plusMinus(List<Integer> arr) {
//     // Write your code here
//     int positiveCount,negativeCount,zeroCount;
//     positiveCount=negativeCount=zeroCount=0;
//     int total=arr.size();

//     for(int nums:arr){
//         if(nums>0) positiveCount++;
//         if(nums<0) negativeCount++;
//         if(nums==0) zeroCount++;
//     }

//     float positiveRatio=positiveCount/total;
//     float negativeRatio=negativeCount/total;
//     float zeroRatio=zeroCount/total;

//     System.out.printf("%.6f", positiveRatio);
//     System.out.printf("%.6f", negativeRatio);
//     System.out.printf("%.6f", zeroRatio);

//     }

// }
// public class PlusMinus {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//         List<Integer> arr = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             int arrItem = Integer.parseInt(arrTemp[i]);
//             arr.add(arrItem);
//         }

//         Result.plusMinus(arr);

//         bufferedReader.close();
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

class PlusMinus {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (read.hasNextInt()) {
            int i = read.nextInt();
            arr.add(i);
        }
        int positiveCount, negativeCount, zeroCount;
        positiveCount = negativeCount = zeroCount = 0;
        int total = arr.size();

        for (int nums : arr) {
            if (nums > 0)
                positiveCount++;
            if (nums < 0)
                negativeCount++;
            if (nums == 0)
                zeroCount++;
        }

        float positiveRatio = positiveCount / total;
        float negativeRatio = negativeCount / total;
        float zeroRatio = zeroCount / total;

        System.out.printf("%.6f", positiveRatio);
        System.out.printf("%.6f", negativeRatio);
        System.out.printf("%.6f", zeroRatio);

    }
}