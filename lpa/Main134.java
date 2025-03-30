package dev.lpa;
import java.util.*;
public class Main134 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            List<Character> list=new LinkedList<>();
            char prev=s.charAt(0);
            boolean flag=false;
            list.add(prev);
            for(int i=1;i<n;i++){
                if(s.charAt(i)!=prev){
                    if(list.contains(s.charAt(i))){
                        flag=true;
                        break;
                    }
                    list.add(s.charAt(i));
                }
                prev=s.charAt(i);
            }
            System.out.println(flag?"NO":"YES");
        }
    }
}
