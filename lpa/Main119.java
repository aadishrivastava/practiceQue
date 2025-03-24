package dev.lpa;
import java.util.*;
public class Main119 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int hrs=sc.nextInt();
            int min=sc.nextInt();
            System.out.println(((23-hrs)*60)+(60-min));
        }
    }
}
