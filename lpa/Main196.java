package dev.lpa;

import java.util.*;

public class Main196 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] height=new int[n];
            for(int i=0;i<n;i++)
            {
                height[i]=sc.nextInt();
            }
            int currentPosition = height[k-1];
            Arrays.sort(height);
            int idx=-1;
            for(int i=0;i<n;i++)
            {
                if(height[i]==currentPosition)
                {
                    idx=i;
                    break;
                }
            }
            int time=0;
            String canReach="YES";
            for(int i=idx+1;i<n;i++)
            {
                int reach=Math.abs(height[i]-height[i-1]);
                time+=reach;
                if(time>height[i-1])
                {
                    canReach="NO";
                    break;
                }

            }
            System.out.println(canReach);
        }
    }
}
