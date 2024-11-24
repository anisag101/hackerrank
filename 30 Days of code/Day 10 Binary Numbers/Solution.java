import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        String binary = "";
        while (n != 0) {
        Integer temp = n%2;
        binary = temp.toString().concat(binary);
        n = n/2;
        }
           String[] groupsOfOnes = binary.split("0");
            int maxOnes = 0;
        for (String group : groupsOfOnes) {
            maxOnes = Math.max(maxOnes, group.length());  
        }
        System.out.println(maxOnes);
        
    }    
}
