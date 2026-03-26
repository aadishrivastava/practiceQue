package dev.lpa;
import java.util.*;
public class Main399 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            AadiSolves(n,y,r);
        }
    }
    public static void AadiSolves(int n, int y, int r){
        System.out.println(Math.min(n,r+y/2));
    }
}
