package dev.lpa;
import java.util.*;
public class Main217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String ab=sc.nextLine();
        boolean flag=false;

        for (int i = 0; i < 5; i++) {
            String str=sc.next();
            if(str.charAt(0)==ab.charAt(0) || str.charAt(1)==ab.charAt(1)){
                flag=true;
                break;
            }
        }
        System.out.println(flag?"YES":"NO");

    }
}
