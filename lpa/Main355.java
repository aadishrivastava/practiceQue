package dev.lpa;
import java.util.*;
public class Main355 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            int[] permutation=new int[n];

            for (int i = 0; i < n; i++) {
                permutation[i]=sc.nextInt();
            }

            int[] permutations=AadiSolves(n,permutation);
            for (int i:permutations) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static int[] AadiSolves(int n,int[] permutation){
        int[] suffix=new int[n];
        int[] position=new int[n];
        suffix[n-1]=permutation[n-1];
        position[n-1]=n-1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation[i]>suffix[i+1]) {
                suffix[i]=permutation[i];
                position[i]=i;
            } else {
                suffix[i]=suffix[i+1];
                position[i]=position[i+1];
            }
        }
        boolean completed=false;
        for (int i = 0; i < n && !completed; i++) {
            if (suffix[i]>permutation[i]) {
                reverseArray(permutation,i,position[i]);
                completed=true;
            }
        }
        return permutation;
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
