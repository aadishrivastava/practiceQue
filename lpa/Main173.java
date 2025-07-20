package dev.lpa;
import java.util.*;
public class Main173 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] candy=new int[n];
            int[] orange=new int[n];
            int minCandy=Integer.MAX_VALUE;
            int minOrange=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                candy[i]=sc.nextInt();
                minCandy=Math.min(minCandy,candy[i]);
            }
            for(int i=0;i<n;i++){
                orange[i]=sc.nextInt();
                minOrange=Math.min(minOrange,orange[i]);
            }
            long count=0;
            for (int i = 0; i < n; i++) {
                int removedCandies=candy[i]-minCandy;
                int removedOranges=orange[i]-minOrange;
                count+=Math.max(removedOranges,removedCandies);
            }
            System.out.println(count);
        }
    }
}
