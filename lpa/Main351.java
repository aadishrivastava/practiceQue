package dev.lpa;

import java.util.Scanner;

public class Main351 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int val=Integer.parseInt(s);
            int k = (int) Math.sqrt(val);
            if (k * k == val) {
                System.out.println("0 " + k);
            } else {
                System.out.println(-1);
            }

        }
    }
}


/*
boolean flag=true;
            for (int i = 0; i < val; i++) {
                for (int j = 0; j < val; j++) {
                    if((i+j)*(i+j)==val){
                        System.out.println(i+" "+j);
                        flag=false;
                        break;
                    }
                }
                if (!flag){
                    break;
                }
            }
            if (flag){
                System.out.println(-1);
            }
 */