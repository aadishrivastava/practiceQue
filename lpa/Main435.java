package dev.lpa;

import java.util.*;

public class Main435 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Integer[] arr=new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr, Comparator.reverseOrder());
            boolean hasDuplicates=false;
            for (int i = 0; i < n-1; i++) {
                if(Objects.equals(arr[i], arr[i + 1])){
                    hasDuplicates=true;
                    break;
                }
            }
            if (hasDuplicates){
                System.out.println(-1);
            }else{
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
