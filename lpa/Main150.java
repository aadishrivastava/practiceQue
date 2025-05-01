package dev.lpa;
import java.util.*;
public class Main150 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < 8; i++) {
                String s=sc.nextLine();
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j)!='.'){
                        sb.append(s.charAt(j));
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
