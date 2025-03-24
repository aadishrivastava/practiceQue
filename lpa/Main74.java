package dev.lpa;

import java.util.Scanner;

public class Main74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int rating= sc.nextInt();
            if(rating>=1900){
                System.out.println("Division 1");
            }else if(rating>=1600 ){
                System.out.println("Division 2");
            } else if (rating>=1400 ) {
                System.out.println("Division 3");
            }else{
                System.out.println("Division 4");
            }
        }
    }
}
