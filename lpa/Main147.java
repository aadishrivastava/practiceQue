package dev.lpa;
import java.util.*;
public class Main147 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char maxChar = 'a';
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) > maxChar) {
                    maxChar = s.charAt(i);
                }
            }
            int out = maxChar - 'a' + 1;
            System.out.println(out);
        }
    }
}
//            char[] ch=s.toCharArray();
//            Arrays.sort(ch);