package dev.lpa;

import java.util.Scanner;

public class Main400 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            AadiSolves(k);
        }
    }
    public static void AadiSolves(int k){
        System.out.println(k%2==0?"NO":"YES");
    }
}
