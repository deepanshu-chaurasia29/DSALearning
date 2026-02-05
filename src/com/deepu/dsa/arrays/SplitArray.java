package com.deepu.dsa.arrays;

/**
 * https://leetcode.com/problems/split-array-largest-sum/description/
 * here we have given array and int k which is no. of partitions you have to do with array
 * and find largest sum of each partioned array
 * return the min value among the largest sum of individual array;
 */

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int k = 3;
        System.out.println(splitArrayMaxSum(nums,k));

    }
    static int splitArrayMaxSum(int[] nums, int k){
        int start = 0;  // largest element in array  -> this is the minimum max value comes when array is partioned into size_of_array time
        int end = 0;    // sum of all elements in array -> this will be max value  comes when array ispartioned into 1 parts.

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(i,start);
            end += nums[i];
        }
        if(k == nums.length){
            return start;



















        }
        else if(k == 1 ){
            return end;
        }
        else {

            while (start < end) {
                int mid = start + (end - start) / 2;

                // check how many times array gets partioned
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        // store the current num in next subarray and increase the count of pieces by 1
                        sum = num;
                        pieces++;
                    } else {
                        // add the elements in same subarray
                        sum += num;
                    }
                }

                if (pieces > k) {
                    start = mid + 1;
                } else {
                    end = mid;
                }


            }
            return end;
        }
    }
}
