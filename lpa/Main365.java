package dev.lpa;
import java.util.*;
public class Main365 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(AadiSolves(n));
        }
    }
    public static String AadiSolves(int n){
        return n%2==0?"Sakurako":"Kosuke";
    }
}
