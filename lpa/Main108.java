package dev.lpa;
import java.util.*;
public class Main108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int wrongeven=0;
            int wrongodd=0;
            for(int i=0;i<n;i++){
                if(i%2==0 && arr[i]%2!=0){
                    wrongeven++;
                }else if(i%2!=0 && arr[i]%2==0){
                    wrongodd++;
                }
            }
            System.out.println((wrongeven==wrongodd?wrongeven:-1));
        }
    }
}
