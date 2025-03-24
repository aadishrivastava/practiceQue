package dev.lpa;
import java.util.*;
public class Main109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int k=sc.nextInt();
            System.out.println((k-1)%3==0?"YES":"NO");
        }
    }
}
