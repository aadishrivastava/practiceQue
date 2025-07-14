package dev.lpa;
import java.util.*;
public class Main169 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if((l*2)<=r){
                System.out.println(l+" "+(2*l));
            }else{
                System.out.println(-1+" "+-1);
            }
        }
    }
}
