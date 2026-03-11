package dev.lpa;

import java.util.Scanner;

public class Main377 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();
            AadiSolves(a1,a2,a4,a5);
        }
    }
    public static void AadiSolves(int a1, int a2, int a4, int a5){
        int x=a1+a2;
        int y=a4-a2;
        int z=a5-a4;
        if(x==y && y==z){
            System.out.println(3);
        } else if (x!=y && y!=z && x!=z) {
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}
