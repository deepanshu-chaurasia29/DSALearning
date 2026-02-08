package com.deepu.dsa.arrays;

public class Rotated_Binary_Search_Duplicates {
    static void main() {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 10;
        System.out.println(search(arr,target));
    }

    public static boolean search(int[] nums, int target) {
        int s =0 , e =nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(target == nums[mid]) return true;

            if(nums[s] == nums[mid] && nums[mid] == nums[e] ){
                s++;
                e--;
                continue;
            }

            if(nums[s] <= nums[mid]){
                // First haaf is sorted
                if(target >= nums[s] && target < nums[mid] ){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
            else{
                // Second half is sorted
                if(target > nums[mid] && target <= nums[e]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }
        return false;
    }
}