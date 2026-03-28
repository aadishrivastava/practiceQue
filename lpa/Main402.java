package dev.lpa;
import java.util.Scanner;

public class Main402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int neg = 0;
            int zero = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zero++;
                } else if (arr[i] < 0) {
                    neg++;
                }
            }
            AadiSolves(zero,neg);
        }
    }
    public static void AadiSolves(int zero, int neg){
        int operations = zero;
        if(neg%2!=0){
            operations+=2;
        }
        System.out.println(operations);
    }
}
