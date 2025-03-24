package dev.lpa;

import java.util.Scanner;

public class Main46 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diffday=0;
        int sameday=0;

        while(a!=0 || b!=0){
            diffday++;
            a--;
            b--;
            if(a==0){
                break;
            }
            if(b==0){
                break;
            }
        }
        System.out.println(diffday);
        int remain=Math.abs(a-b);

        if(remain==1 || remain==0){
            System.out.println(0);
        } else {
            for (int i = remain; i >1 ; i-=2) {
                sameday++;
                remain=remain-2;
            }
            System.out.println(sameday);
        }
    }
}
