package dev.lpa;
import java.util.*;
public class Main164 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Set<Integer> set=new HashSet<>();
            for (int i = 0; i < 4; i++) {
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(set.contains(x)){
                    continue;
                }
                set.add(x);
            }
            List<Integer> list = new ArrayList<>(set);
            System.out.println((int)Math.pow((list.get(1)- list.get(0)),2));

        }

    }
}

//another approach
/*
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            int side = Math.max(maxX - minX, maxY - minY);
            System.out.println(side * side);
        }
 */