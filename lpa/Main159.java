package dev.lpa;
import java.util.*;
public class Main159 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int startBlack=0;
            int endBlack=0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    startBlack=i;
                    break;
                }
            }
            for (int i = n-1; i >=0 ; i--) {
                if(s.charAt(i)=='B'){
                    endBlack=i;
                    break;
                }
            }
            System.out.println(endBlack-startBlack+1);
        }
    }
}
