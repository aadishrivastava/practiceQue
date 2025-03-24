package dev.lpa;

import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        int r= sc.nextInt();

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int totalcost=i*k;

            if(totalcost%10==0 || totalcost%10==r){
                System.out.println(i);
                break;
            }
        }
    }
}
