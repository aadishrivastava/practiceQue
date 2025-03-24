package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] height=new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i]= scanner.nextInt();
        }

        int max=0;
        for (int i = 0; i < n; i++) {
            if (height[i]>height[max]){
                max=i;
            }
        }
        int min=0;
        for (int i = 0; i < n; i++) {
            if(height[i]<=height[min]){
                min=i;
            }
        }

        int swaps=0;
        swaps+=max;
        if(min>max){
            swaps+=(n-1-min);
        }else{
            swaps+=(n-1-min-1);
        }
        System.out.println(swaps);
    }
}




