package com.deepu.dsa.arrays;

// PS :- find smallest element greater than target, array is sorted.
public class Smallest_Element_Greater_Than_Target {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,9};
        int t = 7;
        System.out.println(find(arr,t));

    }
    public static int find(int[] arr,int t){
        int s = 0;
        int e = arr.length -1;

        while(s <= e){
            int mid = s +(e-s)/2;
            if(arr[mid] == t){
                return arr[mid];
            }
            if(arr[mid] > t && arr[mid-1] < t){
                return arr[mid];
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
}
