import java.util.Scanner;

public class Solution {



    static int solveMeFirst(int a, int b) {
    return a+b; 
      
    }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("a = ");
        a = in.nextInt();
        int b;
        System.out.print("b = ");
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
        
        in.close();
    }
}
