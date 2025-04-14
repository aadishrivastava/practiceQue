package dev.lpa;
import java.util.*;
public class Main146 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int max=1;
        int current=1;
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[i-1]){
                current++;
                max=Math.max(max,current);
            }else{
                current=1;
            }
        }
        System.out.println(max);
    }
}
