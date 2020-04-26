import java.util.Scanner;

public class Solution {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int n = input.nextInt();
        
        int leftDiagonal = input.nextInt(); 
        int rightDiagonal = 0;
        
        for(int i = 1; i<n*n; i++) 
        {
            int value = input.nextInt();
            if(i%(n+1) == 0)
            {

                leftDiagonal += value;
            }
            if(i%(n-1) == 0 && i != (n*n)-1)
            {
                rightDiagonal += value;
            }
        }
        System.out.println(Math.abs(leftDiagonal-rightDiagonal));
        
        
    }
}
