package dev.lpa;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String s= scanner.nextLine();
        String t= scanner.nextLine();

        StringBuilder st= new StringBuilder(s).reverse();

        if(t.contentEquals(st)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
