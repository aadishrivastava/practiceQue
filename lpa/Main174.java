package dev.lpa;
import java.util.*;
public class Main174 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            int evenCount=0;
            int oddCount=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if (arr[i] % 2 == 0) {
                    evenCount++;
                }else{
                    oddCount++;
                }
            }

            if(sum%2!=0){
                System.out.println("YES");
            } else if (evenCount>0 && oddCount>0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
