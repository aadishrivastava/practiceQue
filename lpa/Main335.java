package dev.lpa;
import java.util.*;
public class Main335 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(AadiSolves(n));
        }
    }
    public static int AadiSolves(int n){
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n % 2 == 0) {
            return 0;
        }
        return 1;
    }
}
