package com.deepu.dsa.arrays;

// its same as the ceiling problem;
public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'g'};
        char target = 'h';
        int index  = CeilingSearch(arr,target);
        if(index == -1){
            System.out.println("NO CEILING! as target element is greater than the greatest array element");
        }
        else{
            System.out.println(arr[index]);
        }
    }
    static int CeilingSearch(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;


            if (target > arr[arr.length-1]){
                return 0;
            }
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                end =  mid -1;
            }
        }
        return start;
    }
}
