package dev.lpa;
import java.util.*;
public class Main187 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int operations=0;
            while(n>=a && n>=b){
                if(a>b){
                    b+=a;
                }else{
                    a+=b;
                }
                operations++;
            }
            System.out.println(operations);
        }
    }
}
