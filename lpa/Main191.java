package dev.lpa;
import java.util.*;
public class Main191 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int sum = 0, zero = 0, one = 0, two = 0 ;
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if(a[i] == 0){
                    zero++;
                } else if(a[i] == 1){
                    one++;
                } else{
                    two++;
                }
            }

            if(sum > s || s - sum == 1) {
                for(int i=0;i<zero;i++){
                    System.out.print(0 + " " );
                }
                for(int i=0;i<two;i++){
                    System.out.print(2 + " " );
                }
                for(int i=0;i<one;i++){
                    System.out.print(1 + " " );
                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
        }
    }

}
