package dev.lpa;

import java.util.Scanner;

public class Main256 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                count++;
            }else {
                res.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        res.append(s.charAt(s.length()-1)).append(count);
        System.out.println(res);
    }
}
