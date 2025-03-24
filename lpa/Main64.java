package dev.lpa;
import java.util.*;
public class Main64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n=sc.nextInt();
            List<Integer> a=new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            boolean possible=true;
            for (int i = 1; i <a.size(); i++) {
                if(a.get(i)-a.get(i-1)>1 ){
                    possible=false;
                    break;
                }

            }
            if(possible){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
