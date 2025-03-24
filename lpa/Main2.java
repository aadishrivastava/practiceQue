package dev.lpa;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int count=1;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] next = new int[n];
        next[0]= scanner.nextInt();


        for(int i=1; i< next.length;i++){
            next[i]= scanner.nextInt();
            if(next[i]!=next[i-1]){
                count++;
            }
        }

        System.out.println(count);
    }
}
