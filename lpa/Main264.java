package dev.lpa;

import java.util.Scanner;

public class Main264 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=sc.nextInt();
        int count=0,max=0;
        for (int i = 0; i < s.length(); i++) {
            if(i%l==0){
                max=Math.max(count,max);
                count=0;
            }
            if(s.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println(Math.max(count,max));
    }
}
