package dev.lpa;
import java.util.*;
public class Main339 {
    public static void main(String[] args) {
        int[] cost={2,2,2};
        int[] capacity={3,5,4};
        System.out.println(maxCapacity(cost,capacity,5));
    }
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] combination = new int[n][2];
        for (int i = 0; i < n; i++) {
            combination[i][0] = costs[i];
            combination[i][1] = capacity[i];
        }
        Arrays.sort(combination, Comparator.comparingInt(a -> a[0]));
        int[] prefix=new int[n];
        prefix[0]=combination[0][1];
        for (int i = 1; i < n; i++) {
            prefix[i]=Math.max(prefix[i - 1], combination[i][1]);
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            int cost=combination[i][0];
            int cap=combination[i][1];
            if (cost<budget) {
                ans=Math.max(ans, cap);
            }
            int rem=budget-cost-1;
            if (rem<0) {
                continue;
            }
            int idx = upperBound(combination, i - 1, rem);
            if (idx >= 0) {
                ans = Math.max(ans, cap + prefix[idx]);
            }
        }
        return ans;
    }
    public static int upperBound(int[][] arr, int high, int target) {
        int low=0,result=-1;
        while (low<=high) {
            int mid=(low + high)/2;
            if (arr[mid][0]<=target) {
                result=mid;
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return result;
    }
}
