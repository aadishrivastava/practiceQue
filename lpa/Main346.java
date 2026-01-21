package dev.lpa;

import java.util.*;

public class Main346 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (s.equals(sorted)) {
                System.out.println("Bob");
                continue;
            }
            ArrayList<Integer> list= new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != sorted.charAt(i)) {
                    list.add(i + 1);
                }
            }
            System.out.println("Alice");
            System.out.println(list.size());
            for(int idx:list){
                System.out.print(idx + " ");
            }
            System.out.println();
        }

    }
}
