package dev.lpa;
import java.util.*;
public class Main127 {
    public static void main(String[] args) {

        Integer[] arr={1,2,3,4,5};
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
        for (int i = 0; i < 2; i++) {
            list.removeFirst();
            list.add(list.size(),arr[i]);
        }
        System.out.println(list);
    }
}
