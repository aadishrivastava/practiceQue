package dev.lpa;
import java.util.*;
public class Main374 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            AadiSolves(n,s);
        }
    }
    public static void AadiSolves(int n, String s){
        char[] arr = s.toCharArray();
        for (int i = 1; i < n-1; i++) {
            if(arr[i-1]=='1' && arr[i]!='1' && arr[i+1]=='1'){
                arr[i]='1';
            }
        }
        String maxStr = new String(arr);
        char[] arr2 = maxStr.toCharArray();
        for (int i = 1; i < n-1; i++) {
            if(arr2[i-1]=='1' && arr2[i]=='1' && arr2[i+1]=='1'){
                arr2[i]='0';
            }
        }

        String minStr = new String(arr2);

        int min = minStr.replace("0","").length();
        int max = maxStr.replace("0","").length();

        System.out.println(min + " " + max);
    }
}
