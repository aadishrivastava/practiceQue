package dev.lpa;
import java.util.*;
public class Main178 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a-b==0){
                System.out.println(0);
                continue;
            }
            int result=a-b;
            if(result>0){
                if (result%2==0){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }else{
                if(Math.abs(result)%2==0){
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }
        }
    }
}


/*
        another cleaner way
            if (a == b) {
                System.out.println(0);
            } else if (a > b) {
                System.out.println((a - b) % 2 == 0 ? 1 : 2);
            } else {
                System.out.println((b - a) % 2 == 1 ? 1 : 2);
            }
 */