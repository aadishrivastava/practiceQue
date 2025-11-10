package dev.lpa;
import java.util.*;
public class Main299 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,arr));
        }

    }
    public static String AadiSolves( int n,int[] arr){
        Arrays.sort(arr);
        boolean ok = true;
        for (int idx = 1; idx + 1 < n; idx += 2) {
            if (arr[idx] != arr[idx + 1]) {
                ok = false;
                break;
            }
        }
        return ok ? "YES" : "NO";

    }
}
