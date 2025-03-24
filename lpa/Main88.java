package dev.lpa;

import java.util.Scanner;

public class Main88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s= sc.nextLine();
            if(s.isEmpty()){
                System.out.println();
                continue;
            }
            StringBuilder a=new StringBuilder();
            for (int j = 0; j < s.length(); j=j+2) {
                a.append(s.charAt(j));
            }
            if(s.length()%2==0){
                a.append(s.charAt(s.length()-1));
            }
            System.out.println(a);
        }
    }
}
