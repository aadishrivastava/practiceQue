package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();

            if(n!=5){
                System.out.println("NO");
                continue;
            }
            char[] original = "Timur".toCharArray();
            char[] input = s.toCharArray();
            Arrays.sort(original);
            Arrays.sort(input);
            System.out.println(Arrays.equals(original,input)?"YES":"NO");
        }
    }
}
