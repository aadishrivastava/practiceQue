package dev.lpa;

public class Main180 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println("Number of Inversions: "+countInversions(arr,0,arr.length-1));
    }
    public static int countInversions(int[] arr ,int si, int ei){
        if(si>=ei){
            return 0;
        }
        int mid=si+(ei-si)/2;
        int left=countInversions(arr,si,mid);
        int right=countInversions(arr,mid+1,ei);
        int merged=merge(arr,si,mid,ei);
        return left+right+merged;
    }
    public static int merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }

        return count;
    }
}
