package dev.lpa;
import java.util.*;

public class Main83 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        int[] y=new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            y[i]= scan.nextInt();
            if(5-y[i]>=k){
                count++;
            }
        }
        System.out.println(count/3);
    }
}

