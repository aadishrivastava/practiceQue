package dev.lpa;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        StringBuilder actual= new StringBuilder();

        for (int i = 1; i <=n-1; i++) {
            if(i%2==0){
                actual.append("I love that ");
            }else{
                actual.append("I hate that ");
            }
        }
        if(n%2==0){
            actual.append("I love it");
        }else{
            actual.append("I hate it");
        }

        System.out.println(actual);
    }
}
