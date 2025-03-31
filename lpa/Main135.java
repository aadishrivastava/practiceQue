package dev.lpa;
import java.util.*;
public class Main135 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            Integer[] b=new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b,Collections.reverseOrder());
            for (int i = 0; i < k; i++) {
                if(a[i]<b[i]){
                    a[i]=b[i];
                }else{
                    break;
                }
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
