package dev.lpa;
import java.util.*;
public class Main390 {
    public static void question(long[] arr){
        Arrays.sort(arr);
        long largest = arr[arr.length-1];
        long sum = 0;
        for (long l : arr) {
            long sum1 = largest - l;
            sum = sum + sum1;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        question(arr);
    }
}
