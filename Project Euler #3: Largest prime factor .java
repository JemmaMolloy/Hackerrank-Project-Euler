import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(in.hasNextLine())
        {
            long n = in.nextLong();
            long biggest = -1; 
  
            
                while (n % 2 == 0) 
                { 
                    biggest = 2; 
        
                    
                    n=n/2; 
                } 
    
                for (int i = 3; i <= Math.sqrt(n); i += 2) 
                { 
                    while (n % i == 0) 
                    { 
                        biggest = i; 
                        n = n/i; 
                    } 
                } 

                if (n > 2) 
                {
                    biggest = n; 
                }
                
            
            System.out.println(biggest);
        } 
    }
}
