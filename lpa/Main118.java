package dev.lpa;

import java.util.Scanner;

public class Main118 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            int[] a=new int[n];
            int cnt=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2!=0){
                    cnt++;
                }
            }
            if(cnt%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
