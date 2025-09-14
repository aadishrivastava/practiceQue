package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main220 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            ArrayList<Long> odd=new ArrayList<>();
            ArrayList<Long> even=new ArrayList<>();
            long sum=0;
            long[] a=new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                if(a[i]%2==0){
                    even.add(a[i]);
                }else{
                    odd.add(a[i]);
                }
            }
            Collections.sort(odd);
            Collections.sort(even);
            if(odd.isEmpty()){
                System.out.println(0);
                continue;
            }
            sum+=odd.removeLast();
            for (long x : even) {
                sum += x;
            }
            int i=0;
            int j=odd.size()-1;
            while (i <= j) {
                i++;
                if (i > j) break;
                sum += odd.get(j--);
            }
            System.out.println(sum);

        }
    }
}
