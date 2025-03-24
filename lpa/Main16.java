package dev.lpa;

import java.util.*;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int width=0;

        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
            if(a[i]>h){
                width=width+2;
            }else {
                width++;
            }
        }
        System.out.println(width);
    }
}
