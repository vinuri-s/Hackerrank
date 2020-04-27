import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int grade = scanner.nextInt();

            
            int newGrade = ((grade / 5) + 1) * 5;
            
            if(newGrade < 40) 
            {
                System.out.println(grade);
                continue;
            }
            
            if((newGrade - grade) < 3) System.out.println(newGrade);
            else
                System.out.println(grade);
        }
    }
}