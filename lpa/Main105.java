package dev.lpa;

import java.util.Scanner;

public class Main105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n= sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine();
            int x=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') {
                    x++;
                }
            }
            long y=n-x;
            if(x<2 || y<1){
                System.out.println(0);
            }else{
                long x1=x/2;
                long x2=x-x1;
                System.out.println(x1*x2*y);
            }
        }
    }
}
