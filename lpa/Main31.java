package dev.lpa;

import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            str[i]=sc.nextLine();

        }
        for (int i = 0; i < n; i++) {
            if(str[i].contains("Tetrahedron")){
                count+=4;
            }
             if(str[i].contains("Cube")){
                count+=6;
            }
            if(str[i].contains("Octahedron")){
                count+=8;
            }
            if(str[i].contains("Dodecahedron")){
                count+=12;
            }
            if(str[i].contains("Icosahedron")){
                count+=20;
            }
        }
        System.out.println(count);
    }
}
