package dev.lpa;

import java.util.Scanner;

public class Main96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine().trim();

            if(s.indexOf('1')== -1){
                System.out.println(0);
                continue;
            }

            int transitions=0;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j) != s.charAt(j-1)){
                    transitions++;
                }
            }
            if(s.charAt(0)=='1'){
                transitions+=1;
            }
            System.out.println(transitions);
        }
    }
}
