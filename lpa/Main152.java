package dev.lpa;
import java.util.*;
public class Main152 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=1;
            boolean found=false;

                for (int i = 1; i < n; i++) {
                    if(arr[i]==arr[i-1]){
                        count++;
                        if(count==3){
                            System.out.println(arr[i]);
                            found=true;
                            break;
                        }
                    } else{
                        count=1;
                    }
                }

            if(!found){
                System.out.println(-1);
            }
        }
    }
}
