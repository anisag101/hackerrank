import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int testNo = scan.nextInt();
        for (int i =1 ; i <=testNo ; i++)
        {
           String string = scan.next();
           char[] charA = string.toCharArray();
           String even = "";
           String odd = "";
           
            for (int j =0 ; j< string.length() ; j++)
            {
                 if (j%2==0)
                 {
                     even = even + charA[j];
                 }
                 else
                 {
                     odd = odd + charA[j];
                 }
            }
            System.out.println(even + " "+  odd);
        }
    }
}