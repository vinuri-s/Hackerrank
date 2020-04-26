import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
    scanner.close();

    float plus =0;
        float minus =0;
        float zero =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                plus++;
            }else if(arr[i]<0){
                minus++;
            }else if(arr[i]==0){
                zero++;
            }

            
        }
        float sumPlus = plus/n;
            float sumMinus = minus/n;
            float sumZero = zero/n;
            
            System.out.printf("%.6f\n",sumPlus);
             System.out.printf("%.6f\n",sumMinus);
             System.out.printf("%.6f\n",sumZero);
    }
}
