package dev.lpa;

import java.util.Scanner;

public class Main243 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();

            System.out.println(n%3==0?0:n%3==1?2:1);
        }
    }
}
