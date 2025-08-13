package dev.lpa;
import java.util.*;
public class Main203 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[][] casino =new int[n][3];
            for (int i = 0; i < n; i++) {
                casino[i][0]=sc.nextInt();
                casino[i][1]=sc.nextInt();
                casino[i][2]=sc.nextInt();
            }
            Arrays.sort(casino, (a, b) -> {
                if (a[0] == b[0]) return Integer.compare(b[2], a[2]);
                return Integer.compare(a[0], b[0]);
            });


            for (int i = 0; i < n; i++) {
                    if (k >= casino[i][0] && k <= casino[i][1] && k <= casino[i][2]) {
                        k = casino[i][2];
                    }
                }

            System.out.println(k);
        }

    }
}
