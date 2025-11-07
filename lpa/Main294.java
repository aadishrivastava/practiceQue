package dev.lpa;

import java.util.Scanner;

public class Main294 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                s1.append('1');
                s2.append('0');
            }else{
                s2.append('1');
                s1.append('0');
            }
        }
        int count1=0;
        int count2=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s1.charAt(i)){
                count1++;
            }
            if (s.charAt(i) != s2.charAt(i)) {
                count2++;
            }
        }
        System.out.println(Math.min(count1,count2));
    }
}
