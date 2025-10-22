package dev.lpa;

import java.util.Scanner;

public class Main245 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0,z=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='0'){
                    z++;
                }
            }
            for (int i = 0; i < z; i++) {
                if(s.charAt(i)=='1'){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
