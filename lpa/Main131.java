package dev.lpa;
import java.util.*;
public class Main131 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            String[] parts = s.split("\\+");
            int n1 = Integer.parseInt(parts[0]);
            int n2 = Integer.parseInt(parts[1]);

            System.out.println(n1 + n2);


        }
    }
}
//StringBuilder s=new StringBuilder(sc.nextLine());
//int n1=Integer.parseInt(String.valueOf(s.charAt(0)));
//int n2=Integer.parseInt(String.valueOf(s.charAt(2)));
//            System.out.println(n1+n2);