package dev.lpa;
import java.util.*;
public class Main124 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                if(2*b>a){
                    System.out.println((int)Math.pow(2*b,2));
                }else{
                    System.out.println(a*a);
                }
            }else{
                if(2*a>b){
                    System.out.println((int)Math.pow(2*a,2));
                }else{
                    System.out.println(b*b);
                }
            }
        }
    }
}

