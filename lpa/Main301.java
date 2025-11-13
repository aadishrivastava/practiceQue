package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main301 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("\\[|\\]","").trim();
        String[] arr=s.split(",");
        ArrayList<Integer> list=new ArrayList<>();
        for (String str:arr){
            list.add(Integer.parseInt(str.trim()));
        }
        for (Integer integer:list){
            System.out.println(integer);
        }
    }
}
