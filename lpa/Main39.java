package dev.lpa;

import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] event=new int[n];
        for (int i = 0; i < n; i++) {
            event[i]= sc.nextInt();
        }
        int count=0;
        int recruit=0;
        if(event[0]==-1){
            count++;
        }else{
            recruit+=event[0];
        }
        for (int i = 1; i < n; i++) {
            if(event[i]==-1){
                if(recruit>0){
                    recruit--;
                }else{
                    count++;
                }
            }else{
                recruit+=event[i];
            }
        }
        System.out.println(count);
    }
}
