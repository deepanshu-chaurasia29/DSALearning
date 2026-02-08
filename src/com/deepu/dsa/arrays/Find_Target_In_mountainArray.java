package com.deepu.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

// time complexity will be O(n)
//public class Find_Target_In_mountainArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 3, 2,1};
//        int target = 2;
//        int ans = searchMountainArray(arr, target);
//        System.out.println(ans);
//    }
//
//    public static int searchMountainArray(int[] arr, int target){
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(target == arr[i]){
//                list.add(i);
//            }
//        }
//        return list.get(0);
//    }
//
//}

public class Find_Target_In_mountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {
        int peakIndex = peakElementIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peakIndex);

        // This will be true when we find element in first half. That's why it has some value not -1.
        // Agar "-1" aata matlab ki element is first half me nhi tha. So check again in next part.
        if (firstTry == -1) {
            return orderAgnosticBinarySearch(arr, target, peakIndex + 1, arr.length - 1);
        } else {
            return firstTry;
        }

    }

    public static int peakElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAssOrDesc = arr[start] < arr[end];
        // true -> asc
        // false -> desc
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;

            // search in the ascending part
            if (isAssOrDesc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Search in descending part
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;

    }

}
