package dev.lpa;
import java.util.*;
public class Main177 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a=sc.next();
            int[] count=new int[7];
            for(char i:a.toCharArray()){
                count[i - 'A']++;
            }
            int problems=0;
            for(int i:count){
                if(i<m){
                    problems+=m-i;
                }
            }
            System.out.println(problems);
        }
    }
}


// we can use a hashmap too to store the frequency of characters coming
// but that is less optimal for this case