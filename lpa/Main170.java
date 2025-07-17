package dev.lpa;
import java.util.*;
public class Main170 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] b=new int[n];
            int[] c=new int[m];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                c[i]=sc.nextInt();
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                if(b[i]>k){
                    continue;
                }
                for (int j = 0; j < m; j++) {
                    if(c[j]>k || b[i]+c[j]>k){
                        continue;
                    }
                    count++;

                }
            }
            System.out.println(count);
        }
    }
}


/* another way more efficient for large inputs
            Arrays.sort(c);
            int count = 0;
            for (int i = 0; i < n; i++) {
                int remaining = k - b[i];
                if (remaining < 0) continue;
                int idx = Arrays.binarySearch(c, remaining);
                if (idx >= 0) {
                    while (idx + 1 < m && c[idx + 1] == remaining) {
                        idx++;
                    }
                    count += (idx + 1);
                } else {
                    int insertionPoint = -(idx + 1);
                    count += insertionPoint;
                }
            }
 */