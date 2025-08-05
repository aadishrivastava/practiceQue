package dev.lpa;
import java.util.*;
public class Main188 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            if (s.contains("...")){
                count = 2;
            }
            else{
                for (int i = 0; i < n; i++)
                    if (s.charAt(i) == '.')
                        count++;
            }
            System.out.println(count);
        }

    }
}
