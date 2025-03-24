package dev.lpa;

import java.util.Scanner;

public class Main99 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int a3= sc.nextInt();
        int a4= sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count=count+a1;
            } else if (s.charAt(i)=='2') {
                count=count+a2;
            } else if (s.charAt(i)=='3') {
                count=count+a3;
            }else{
                count=count+a4;
            }
        }
        System.out.println(count);
    }
}
