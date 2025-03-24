package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        str=str.substring(1,str.length()-1);

        if(str.trim().isEmpty()){
            System.out.println(0);
            return;
        }
        String[] letters=str.split(", ");
        boolean[] seen=new boolean[26];


        for(String letter:letters){
            int index=letter.charAt(0)-'a';
            seen[index]=true;
        }
        int distinct=0;
        for(boolean isseen:seen){
            if(isseen){
                distinct++;
            }
        }
        System.out.println(distinct);

    }
}
