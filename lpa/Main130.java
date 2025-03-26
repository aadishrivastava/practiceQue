package dev.lpa;
import java.util.*;
public class Main130 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            StringBuilder s=new StringBuilder(sc.next());
            while(n>=0 ) {
                if(n==0){
                    System.out.println(0);
                    break;
                }
                if(s.charAt(0)!=s.charAt(s.length()-1) && s.length()!=1){
                    n=n-2;
                    s.delete(0,1);
                    s.deleteCharAt(s.length()-1);
                }else{
                    System.out.println(n);
                    break;
                }
            }

        }

    }
}
