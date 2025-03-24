package dev.lpa;

import java.util.Scanner;

public class Main85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int[] num=new int[3];
            String[] s=new String[3];
            for (int i = 0; i < 3; i++) {
                num[i]= sc.nextInt();
                s[i]=String.valueOf(num[i]);

            }
            if(s[0].equals(s[1])){
                System.out.println(s[2]);
            } else if (s[1].equals(s[2])) {
                System.out.println(s[0]);
            }else{
                System.out.println(s[1]);
            }
            t--;
        }
    }
}
