package dev.lpa;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        while(x>5){
            x=x-5;
            count++;
        }
        count++;
        System.out.println(count);
    }
}
