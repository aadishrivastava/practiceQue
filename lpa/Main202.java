package dev.lpa;
import java.util.*;
public class Main202 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];

            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            ArrayList<Integer> list=new ArrayList<>();
            for(int i:a){
                if(i!=-1){
                    list.add(i);
                }
            }
            boolean flag=true;
            if (!list.isEmpty() && list.get(0) == 0) {
                flag = false;
            } else {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (!Objects.equals(list.get(i), list.get(i + 1))) {
                        flag = false;
                        break;
                    }
                }
            }

            System.out.println(flag?"YES":"NO");
        }
    }
}
