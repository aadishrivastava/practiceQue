package dev.lpa;
import java.util.*;
public class Main132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if(arr.length==1){
                System.out.println("YES");
                continue;
            }

            Arrays.sort(arr);
            boolean flag=true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]==arr[i+1]){
                    flag=false;
                    break;
                }

            }
            System.out.println(flag?"YES":"NO");

        }
    }
}
