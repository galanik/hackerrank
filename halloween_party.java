hackerrank
==========
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long K ;
        for (int i = 0; i<T; i++){
            K = in.nextLong();
      
            if(K%2==1){
                System.out.println((K/2)*((K/2)+1));
            }
            else{
                
                System.out.println((K/2)*(K/2));
            }
        }
        in.close();
    }
}
