
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tallest = 0;
        int count = 0;
        
        
        for(int i=0; i < n; i++){
            int height = in.nextInt();
            
            if(height > tallest){
                tallest = height;
                count = 1;
            }
            else if(height == tallest){
                 count++;
            }
        }
        System.out.println(count);
    }
}
