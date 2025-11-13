package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main300 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
