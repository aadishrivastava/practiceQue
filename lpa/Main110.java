package dev.lpa;
import java.util.Scanner;

public class Main110 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(n/2);
        }
    }
}
