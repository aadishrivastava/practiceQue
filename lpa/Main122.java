package dev.lpa;
import java.util.*;
public class Main122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            int onecnt=0;
            int sum=0;
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    onecnt++;
                }
                sum+=arr[i];
            }
            if(sum % 2 == 0 && (onecnt > 0 || (n - onecnt) % 2 == 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
