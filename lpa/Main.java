package dev.lpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        int[] next=new int[n];
        for(int i=0;i<n;i++){
            next[i]=scanner.nextInt();

        }
        for(int i=0;i<next.length;i++){
            if(next[i]==1){
                count++;
            }
        }
        if(count>0){
            System.out.println("HARD");
        }else{
            System.out.println("Easy");
        }
    }
}
