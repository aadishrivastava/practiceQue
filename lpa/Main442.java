package dev.lpa;

import java.util.Scanner;

public class Main442 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int count=0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i)=='('){
                    count++;
                }else{
                    count--;
                }
            }
            System.out.println(count==0?"YES":"NO");
        }
    }
}
