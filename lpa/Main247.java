package dev.lpa;

import java.util.Scanner;

public class Main247 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next();
            char c=s.charAt(0);
            boolean flag=true;
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i)!=c){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }else{
                s=s.substring(1)+c;
                System.out.println("YES");
                System.out.println(s);
            }

        }
    }
}
