package dev.lpa;

import java.util.Scanner;

public class Main80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k= sc.nextInt();
            int count=0,num=1;
            while(true){
                if(num%3!=0 && num%10!=3){
                    count+=1;
                    if(count==k){
                        System.out.println(num);
                        break;
                    }
                }
                num+=1;
            }
        }
    }
}
