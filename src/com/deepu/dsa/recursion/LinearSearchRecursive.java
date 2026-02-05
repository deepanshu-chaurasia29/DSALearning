package com.deepu.dsa.recursion;

import java.util.ArrayList;

public class LinearSearchRecursive {
    static void main() {
        int[] arr = {7, 7,4,5,67,7};
        int target = 7;
        ArrayList<Integer> ans = findAllIndex2(arr,target,0);
        System.out.println(ans);

    }

    public static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) || search(arr, target, index + 1);
    }

    // return all indexes of target in array
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // Not an efficient way
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // This will add index from that function call only.
        if (target == arr[index]) {
            list.add(index);
        }
        ArrayList<Integer> listFromBelowCalls =  findAllIndex2(arr, target, index + 1);
        list.addAll(listFromBelowCalls);
        return list;
    }
}
