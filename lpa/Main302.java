package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main302 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] arr=new int[Integer.parseInt(s)];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

}
