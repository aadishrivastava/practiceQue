package dev.lpa;

import java.util.Scanner;

public class Main126 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int cnt=0;
            for(char c:s.toCharArray()){
                if (c == 'A') {
                    cnt++;
                }else{
                    cnt--;
                }
            }
            System.out.println(cnt>0?'A':'B');
        }
    }
}
