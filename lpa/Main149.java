package dev.lpa;
import java.util.*;
public class Main149 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] pi=new int[n];
        for (int i = 0; i < n; i++) {
            pi[i]=sc.nextInt();
        }
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            res[pi[i]-1]=i+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
