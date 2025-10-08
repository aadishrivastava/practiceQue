package dev.lpa;
import java.util.*;

public class Main229 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] count = new int[n + 1];

            for(int j = 0; j < n; j++){
                int x = sc.nextInt();
                count[x]++;
            }

            int missing = 0;
            for(int j = 0; j < k; j++){
                if(count[j] == 0){
                    missing++;
                }
            }

            System.out.println(Math.max(missing,count[k]));
        }

        sc.close();
    }
}
