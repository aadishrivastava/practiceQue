package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main198 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<10){
                System.out.println(n);
                continue;
            }
            char[] ch=String.valueOf(n).toCharArray();
            Arrays.sort(ch);
            System.out.println(ch[0]-'0');
        }
    }
}
