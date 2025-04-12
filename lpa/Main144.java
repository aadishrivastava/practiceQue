package dev.lpa;
import java.util.*;
public class Main144 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        char current ='a';
        int totalMoves=0;
        for(int i=0;i<t.length();i++){
            char target=t.charAt(i);
            int distance=Math.abs(target-current);
            totalMoves+=Math.min(distance,26-distance);
            current=target;
        }
        System.out.println(totalMoves);
    }
}
