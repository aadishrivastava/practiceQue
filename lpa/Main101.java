package dev.lpa;

import java.util.Scanner;

public class Main101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int next=nextPrime(n);
        System.out.println(next==m?"YES":"NO");


    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int nextPrime(int n){
        int next=n+1;
        while(!isPrime(next)){
            next++;
        }
        return next;
    }
}
