package dev.lpa;
import java.util.*;
public class Main151 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            if(n<2){
                System.out.println(1);
            } else if (n%2==0) {
                System.out.println(n/2);
            }else{
                System.out.println(n/2+1);
            }
        }
    }
}

//System.out.println((n+1)/2)    ye bhi use kr sakte hai