import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int biggest=0;
            int num=0;
            while(num<n)
            {
                for(int i=100;i<1000;i++)
                {
                    for(int j=100;j<1000;j++)
                    {
                        num=i*j;
                        if(isPalindrome(num)&&num>biggest&&num<n)
                        {
                            biggest=num;
                        }
                    } 
                }
            }
            System.out.println(biggest);
            
        }
    }
    public static boolean isPalindrome(int num1)
    {
        boolean pal=true;
        String num=Integer.toString(num1);
        int start=0;
        int end=num.length()-1;
        while(start<end)
        {
            if(num.charAt(start)!=num.charAt(end))
            {
                pal=false;
            }
            start++;
            end--;
        }
        return pal;
    }
}
