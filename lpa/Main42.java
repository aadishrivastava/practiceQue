package dev.lpa;

import java.util.Scanner;

public class Main42 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int remain=240-k;
        int i=1;
        int count=0;
        while(n>0){
            remain=remain-(5*i);
            if(remain<0){
                break;
            }
            n--;
            i++;
            count++;

        }
        System.out.println(count);
    }
}
