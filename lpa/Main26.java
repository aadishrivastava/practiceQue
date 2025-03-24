package dev.lpa;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String pangram = scanner.nextLine();
        pangram=pangram.toLowerCase();
        boolean flag = true;

        for (char i = 'a'; i <='z' ; i++) {
            if(!pangram.contains(String.valueOf(i))){
                flag=false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
