package dev.lpa;
import java.util.*;
public class Main142 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] strength=new int[n];
            for(int i=0;i<n;i++){
                strength[i]=sc.nextInt();
            }
            Arrays.sort(strength);
            int min=strength[1]-strength[0];
            for(int i=2;i<n;i++){
                min = Math.min(min, strength[i] - strength[i - 1]);
            }
            System.out.println(min);
        }
    }
}
