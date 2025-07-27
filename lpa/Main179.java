package dev.lpa;

public class Main179 {
    public static void main(String[] args) {
        int[] arr={4,2,9,7,1,5};
        System.out.println("Max Element: "+largestElement(arr,0,arr.length-1));
    }
    public static int largestElement(int[] arr, int si, int ei){

        if(si==ei){
            return arr[si];
        }
        int mid=si+(ei-si)/2;
        int leftMax=largestElement(arr, si, mid);
        int rightMax=largestElement(arr,mid+1,ei);

        return Math.max(leftMax, rightMax);
    }
}
