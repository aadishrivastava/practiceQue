package dev.lpa;
import java.util.*;
public class Main205 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] copy=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                copy[i]=arr[i];
            }
            Arrays.sort(arr);
            if(Arrays.equals(arr,copy)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(2);
                for (int i = 0; i < n-1; i++) {
                    if(copy[i]>copy[i+1]){
                        System.out.print(copy[i]+" "+copy[i+1]);
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
}
