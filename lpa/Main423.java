package dev.lpa;

import java.util.Scanner;

public class Main423 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int zero=0;
            int one=0;
            int two=0;
            int three=0;
            int five=0;
            int count=0;
            for (int i = 0; i < n; i++) {
                if (arr[i]==0){
                    zero++;
                } else if (arr[i]==1) {
                    one++;
                } else if (arr[i]==2) {
                    two++;
                } else if (arr[i]==3) {
                    three++;
                } else if (arr[i]==5) {
                    five++;
                }

                if(one>=1 && two>=2 && three>=1 && five>=1 && zero>=3){
                    count=i+1;
                    break;
                }
            }
            System.out.println(count);

        }
    }
}
