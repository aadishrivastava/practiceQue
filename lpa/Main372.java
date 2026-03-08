package dev.lpa;
import java.util.*;
public class Main372 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n*2];
            for (int i = 0; i < n*2; i++) {
                arr[i]=sc.nextInt();
            }
            AadiSolves(arr);
        }
    }
    public static void AadiSolves(int[] arr){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        for(Integer i:set){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
