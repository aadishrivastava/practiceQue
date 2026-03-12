package dev.lpa;

import java.util.Scanner;

public class Main378 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
            String s=sc.next();
            Aadisolves(s,str);
        }
    }
    public static  void Aadisolves(String s,String str){
        int time=0;
        for (int i = 0; i < s.length() - 1; i++) {
            int pos1=str.indexOf(s.charAt(i));
            int pos2=str.indexOf(s.charAt(i+1));
            time+=Math.abs(pos2-pos1);
        }
        System.out.println(time);
    }
}
