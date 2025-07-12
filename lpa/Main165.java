package dev.lpa;
import java.util.*;
public class Main165 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            char[][] grid = new char[3][3];
            int rowWithQuestion = -1;

            for (int i = 0; i < 3; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
                if (line.contains("?")) {
                    rowWithQuestion = i;
                }
            }

            char a = ' ', b = ' ';
            int idx = 0;
            for (int j = 0; j < 3; j++) {
                if (grid[rowWithQuestion][j] != '?') {
                    if (idx == 0) {
                        a = grid[rowWithQuestion][j];
                    }
                    else {
                        b = grid[rowWithQuestion][j];
                    }
                    idx++;
                }
            }


            if (a != 'A' && b != 'A') {
                System.out.println('A');
            }
            else if (a != 'B' && b != 'B'){
                System.out.println('B');
            }
            else {
                System.out.println('C');
            }
        }
    }
}

