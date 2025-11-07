package dev.lpa;

import java.util.Scanner;

public class Main291 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String phase=sc.next();

        if(phase.equals("first")){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println(firstPhase(a,n));
        }else{
            String s=sc.next();
            int[] arr= secondPhase(s);
            System.out.print(arr.length+" ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static String firstPhase(int[] arr,int n){
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch=(char)('a'+arr[i]-1);
            sb.append(ch);
        }

        return sb.toString();
    }
    public static int[] secondPhase(String s){
        int[] arr=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=(s.charAt(i)-'a')+1;
        }
        return arr;
    }
}
