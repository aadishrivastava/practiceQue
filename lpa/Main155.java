package dev.lpa;
import java.util.*;
public class Main155 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String[] s=new String[n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextLine();
            }
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j<4; j++) {
                    if(s[i].charAt(j)=='#'){
                        System.out.print(j+1+" ");
                        break;
                    }

                }
            }
            System.out.println();

        }
    }
}
