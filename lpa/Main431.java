package dev.lpa;
import java.util.*;
public class Main431 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        int maxCount=1;
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(!set.contains(val-1)){
                int count=1;
                while(set.contains(val+1)){
                    count++;
                    val++;
                }
                maxCount=Math.max(maxCount,count);
            }



        }
        System.out.println(maxCount);
    }
}
