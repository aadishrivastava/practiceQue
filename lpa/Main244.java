package dev.lpa;

import java.util.*;

public class Main244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] res=new char[n];
            Arrays.fill(res,'+');
            int top=0,bottom=n-1,maybe=0;
            for(char c:s.toCharArray()){
                if(c=='0'){
                    top++;
                } else if (c=='1') {
                    bottom--;
                }else{
                    maybe++;
                }
            }
            for (int i = 0; i < n; i++) {
                if(i>bottom-maybe || i<top+maybe){
                    res[i]='?';
                }
                if(i<top || i>bottom || k==n){
                    res[i]='-';
                }
            }
            System.out.println(new String(res));
        }
    }
}
