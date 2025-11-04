package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main258 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            char[] s=sc.next().toCharArray();
            char[] t=sc.next().toCharArray();
            boolean flag=true;
            Arrays.sort(s);
            Arrays.sort(t);
            for (int i = 0; i < n; i++) {
                if(s[i]!=t[i]){
                    flag=false;
                    break;
                }
            }
            System.out.println(flag?"YES":"NO");
        }

    }
}
