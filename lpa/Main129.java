package dev.lpa;
import java.util.*;
public class Main129 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[4];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int max1=Math.max(arr[0],arr[1]);
            int max2=Math.max(arr[2],arr[3]);
            if(max1<arr[2] && max1<arr[3]){
                System.out.println("NO");
                continue;
            }
            if(max2<arr[0] && max2<arr[1]){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}


/*
another approach
while (t-- > 0) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }

            // Winners of first and second match
            int max1 = Math.max(arr[0], arr[1]); // Winner of (s1 vs s2)
            int max2 = Math.max(arr[2], arr[3]); // Winner of (s3 vs s4)

            // Find the two strongest players
            Arrays.sort(arr); // Sorted array: arr[2] is 2nd highest, arr[3] is highest

            // Check if the two strongest players are the winners of different semifinals
            if ((max1 == arr[2] && max2 == arr[3]) || (max1 == arr[3] && max2 == arr[2])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
}
 */