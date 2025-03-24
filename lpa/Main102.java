package dev.lpa;

import java.util.Scanner;
public class Main102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int count=0;
            String c="codeforces";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)!=c.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
