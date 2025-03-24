package dev.lpa;

import java.util.Scanner;

public class Main120 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int height=0;
        int box=0;
        for (int i = 1; i <= n; i++) {
            box=box+i;
            n=n-box;
            if(n<0){
                break;
            }
            height++;
        }
        System.out.println(height);
    }
}
