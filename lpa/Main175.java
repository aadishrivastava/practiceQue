package dev.lpa;
import java.util.*;
public class Main175 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int[] a = new int[n];
            int left = 0, right = n - 1, index = 0;

            while (left <= right) {
                if (index < n) {
                    a[index++] = b[left++];
                }
                if (index < n){
                    a[index++] = b[right--];
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
