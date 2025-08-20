package dev.lpa;
import  java.util.*;
public class Main207 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==2){
                System.out.println(-1+ " "+2);
                continue;
            }
            for (int i = 0; i < n; i++) {
                if(i==n-1 && i%2!=0){
                    System.out.print(2+" ");
                }
                else if(i%2==0){
                    System.out.print(-1+" ");
                }else{
                    System.out.print(3+" ");
                }
            }
            System.out.println();
        }
    }
}
