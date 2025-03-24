package dev.lpa;
import java.util.*;
public class Main107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        Integer[] arr=new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        int max=arr[0],max2=0;
        for (int i = 1; i < arr.length; i++) {
                if(max< arr[i]) {
                    max2=max;
                    max = arr[i];
                }
                else if(max>arr[i] && max2<arr[i] ){
                    max2=arr[i];
                }
        }

        System.out.println(max+" "+max2);
    }
}
