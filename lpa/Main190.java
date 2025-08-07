package dev.lpa;
import java.util.*;
public class Main190 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            boolean isSorted=true;
            int minVal=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted=false;
                    break;
                }
                int diff=arr[i+1]-arr[i];
                if(diff<0){
                    minVal=0;
                    break;
                }
                minVal=Math.min(diff,minVal);
            }
            if(!isSorted){
                System.out.println(0);
            }else {
                System.out.println((minVal/2)+1);
            }

        }
    }
}
