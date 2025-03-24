package dev.lpa;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int upcount=0;
        int locount=0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                upcount++;
            }
            else if (Character.isLowerCase(s.charAt(i))) {
                locount++;
            }
        }
        if(upcount>locount){
            System.out.println(s.toUpperCase());
        } else{
            System.out.println(s.toLowerCase());
        }
    }
}

