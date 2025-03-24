package dev.lpa;
import java.util.*;
public class Main125 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int max=0,cnt=0;
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m=sc.nextInt();
                if(m==0){
                    cnt++;
                }else{
                    max=Math.max(max,cnt);
                    cnt=0;
                }
            }
            max=Math.max(max,cnt);
            System.out.println(max);
        }
    }
}
