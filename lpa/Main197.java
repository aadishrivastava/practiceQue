package dev.lpa;
import java.util.*;
public class Main197 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] days=new int[n];
            for(int i=0;i<n;i++)
            {
                days[i]=sc.nextInt();
            }
            int consecutive=0,hiked=0;
            for(int i=0;i<n;i++)
            {
                if(days[i]!=0)
                {
                    consecutive=0;
                }
                else
                {
                    consecutive+=1;
                }
                if(consecutive==k)
                {
                    hiked+=1;
                    consecutive=0;
                    i+=1;
                }
            }
            System.out.println(hiked);

        }
    }
}
