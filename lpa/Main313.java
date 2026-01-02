package dev.lpa;

import java.util.Scanner;

public class Main313 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println(AadiSolves(a,b));
        }
    }
    public static int AadiSolves(int a, int b){
        return Math.max(solve(a,b,true),solve(a,b,false));
    }
    public static int solve(int a, int b, boolean startsWhite){
        int layers=0;
        int requiredChoc=1;
        boolean white=startsWhite;
        while(true){
            if(white){
                if(a<requiredChoc){
                    break;
                }
                a-=requiredChoc;
            }else {
                if(b<requiredChoc){
                    break;
                }
                b-=requiredChoc;
            }
            requiredChoc*=2;
            layers++;
            white=!white;
        }
        return layers;
    }
}
