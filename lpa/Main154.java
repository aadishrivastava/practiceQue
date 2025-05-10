package dev.lpa;
import java.util.*;
public class Main154 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0){
            int n=sc.nextInt();
            char[] ch=sc.next().toCharArray();
            int y=0;
            int x=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(ch[i]=='U'){
                    y++;
                } else if (ch[i]=='D') {
                    y--;
                } else if (ch[i]=='R') {
                    x++;
                }else{
                    x--;
                }
                if (x == 1 && y == 1) {
                    flag=true;
                    break;
                }
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}

//        switch (ch[i]) {
//          case 'U':
//              y++;
//              break;
//          case 'D':
//              y--;
//              break;
//          case 'R':
//              x++;
//              break;
//          case 'L':
//              x--;
//              break;
//        }