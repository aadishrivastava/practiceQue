package dev.lpa;

import java.util.Scanner;

public class Main260 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                str.append('1');
            }else{
                str.append('0');
            }
        }
        System.out.println(Integer.parseInt(str.toString(),2));
    }
}
