package dev.lpa;
import java.util.*;
public class Main353 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] permutation=AadiSolves(n);
            for (int i=1; i<=n; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
        }
    }
    public static int[] AadiSolves(int n){
        int[] permutation=new int[n + 1];
        boolean[] numUsed= new boolean[n + 1];
        permutation[n]=1;
        numUsed[1]=true;
        for (int i=2; i<=n-1; i++) {
            permutation[i]=1^i;
            numUsed[permutation[i]]=true;
        }
        for (int i=1; i<=n; i++) {
            if (!numUsed[i]) {
                permutation[1]=i;
                break;
            }
        }
        return permutation;
    }
}


