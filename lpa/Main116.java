package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main116 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();


        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int totalballon=0;
            List<Character> solved=new ArrayList<>();

            for (char c : s.toCharArray()) {
                if(solved.contains(c)){
                    totalballon+=1;
                }else{
                    totalballon+=2;
                    solved.add(c);
                }
            }
            System.out.println(totalballon);
        }
    }
}
