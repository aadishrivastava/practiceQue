package dev.lpa;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int count=0;
        while(a<=b){
            a=a*3;
            b=b*2;
            count++;
        }
        System.out.println(count);
    }

}
