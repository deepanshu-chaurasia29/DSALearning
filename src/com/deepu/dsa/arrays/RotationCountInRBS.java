package com.deepu.dsa.arrays;

public class RotationCountInRBS {
    static void main() {
        int[] arr = {1,2,4,6,7,12,34,56,78};
        System.out.println(findPivot(arr));
        int rotCount = findPivot(arr) + 1;
        System.out.println(rotCount);

    }
    public static int findPivot(int[] arr){
        int s=0,e=arr.length -1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(m < e && arr[m] > arr[m+1]) return m;
            if(m > s && arr[m-1] > arr[m]) return m-1;

            if(arr[s] >= arr[m]){
                e =m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
//
}
