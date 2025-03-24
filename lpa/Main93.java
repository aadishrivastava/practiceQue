package dev.lpa;

import java.util.Scanner;

public class Main93 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x=sc.nextInt();
            int y= sc.nextInt();

            int difference=x+1-y;
            if(difference>=0 && difference%9==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
