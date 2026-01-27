package dev.lpa;

import java.util.Scanner;

public class Main362 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,arr));
        }
    }
    public static String AadiSolves(int n, int[] arr){
        int oddCount=0;
        int evenCount=0;
        for (int i = 0; i < n; i+=2) {
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(oddCount!=0 && evenCount!=0){
            return "NO";
        }
        oddCount=evenCount=0;
        for (int i = 1; i < n; i+=2) {
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(oddCount!=0 && evenCount!=0){
            return "NO";
        }

        return "YES";


    }
}



/*
Approach 2

    public static String AadiSolves(int n, int[] arr) {

        // Parity of first odd-indexed element (0-based index 0)
        int oddParity = arr[0] % 2;

        // Check all odd positions (0-based even indices)
        for (int i = 0; i < n; i += 2) {
            if (arr[i] % 2 != oddParity) {
                return "NO";
            }
        }

        // Parity of first even-indexed element (0-based index 1), if exists
        if (n > 1) {
            int evenParity = arr[1] % 2;

            // Check all even positions (0-based odd indices)
            for (int i = 1; i < n; i += 2) {
                if (arr[i] % 2 != evenParity) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
 */