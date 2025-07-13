package dev.lpa;
import java.util.*;
public class Main166 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for (int i = 1; i <= 5; i++) {
                min=Math.min(a,Math.min(b,c));
                if(min==a){
                    a++;
                }else if(min==b){
                    b++;
                }else{
                    c++;
                }
            }
            System.out.println(a*b*c);
        }
    }
}
