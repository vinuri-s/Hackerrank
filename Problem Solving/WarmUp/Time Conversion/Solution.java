import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String timeArr[] = s.split(":");
        String AmPm = timeArr[2].substring(2,4);
        int hh,mm,ss;
    
        hh = Integer.parseInt(timeArr[0]);
        mm = Integer.parseInt(timeArr[1]);
        ss = Integer.parseInt(timeArr[2].substring(0,2));
            
        String checkPM = "PM",checkAM ="AM";
       
        if(AmPm.equals(checkAM) && hh==12)
        {
            hh=0;
        }
        else if(AmPm.equals(checkPM)&& hh<12)
        {
            hh+=12;
        }
            
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);

        
    }
}
