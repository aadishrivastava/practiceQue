package dev.lpa;
import java.util.*;
public class Main184 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str=sc.nextLine();
            StringBuilder result=new StringBuilder();
            result.append(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i-1)==' '){
                    result.append(str.charAt(i));
                }
            }
            System.out.println(result);
        }
    }
}
