package dev.lpa;
import java.util.*;
public class Main111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String x=sc.nextLine();
            int a=Integer.parseInt(String.valueOf(x.charAt(0)));
            int l=x.length();
            int count=(a-1)*10+(l*(l+1))/2;
            System.out.println(count);
        }
    }
}
