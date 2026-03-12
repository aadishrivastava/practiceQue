package dev.lpa;

import java.util.Scanner;

public class Main379 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();

            }
            String[] move=new String[n];
            for (int i = 0; i < n; i++) {
                sc.nextInt();
                move[i]=sc.next();
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < move[i].length(); j++) {
                    if(move[i].charAt(j)=='D'){
                        if(arr[i]==9){
                            arr[i]=0;
                        }else{
                            arr[i]++;
                        }
                    }else {
                        if(arr[i]==0){
                            arr[i]=9;
                        }else{
                            arr[i]--;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
