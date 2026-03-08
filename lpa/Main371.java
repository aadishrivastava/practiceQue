package dev.lpa;
import java.util.*;
public class Main371 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            StringBuilder result=new StringBuilder();
            if(n<=27){
                result.append("aa");
                n=n-2;
                int i = 'a' + n - 1;
                result.append((char)i);
            } else if (n <= 52) {
                result.append('a');
                result.append((char) ('a' + n - 28));
                result.append('z');
            }
            else {
                result.append((char) ('a' + n - 53));
                result.append("zz");
            }
            System.out.println(result);

        }

    }
}
