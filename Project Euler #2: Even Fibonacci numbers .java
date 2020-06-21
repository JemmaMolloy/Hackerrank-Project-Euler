import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long fib=2;
            long summer=0;
            long sum=0;
            long temp;
            while(fib<n)
            {
                sum+=fib;
                temp=4*fib+summer;
                summer=fib;
                fib=temp;
            }
            System.out.println(sum);
        }
    }
}
