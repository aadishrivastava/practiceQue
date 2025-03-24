package dev.lpa;

import java.util.Scanner;

public class Main92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int count=0;
        for (int i = 0; i < n; i++) {
            int mishka= sc.nextInt();
            int chris= sc.nextInt();

            if(mishka-chris>0){
                count++;
            } else if (chris>mishka) {
                count--;
            }else{
                continue;
            }
        }
        if(count>0){
            System.out.println("Mishka");
        } else if (count<0) {
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
