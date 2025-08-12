package dev.lpa;
import java.util.*;

public class Main199 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String ans="YES";
            long min=(int)1e9;
            for(int i=0;i<n;i++){
                int test=sc.nextInt();
                if(min*2<=test){
                    ans="NO";
                }
                min=Math.min(min, test);
            }
            System.out.println(ans);
        }

    }
}
