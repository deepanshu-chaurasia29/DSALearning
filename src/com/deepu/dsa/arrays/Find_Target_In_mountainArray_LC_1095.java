package com.deepu.dsa.arrays;

public class Find_Target_In_mountainArray_LC_1095 {
//    class Solution {
//        public int findInMountainArray(int target, MountainArray mountainArr) {
//            int peakIndex = peak(mountainArr);
//            int firstTry = searchAsc(mountainArr,target,0,peakIndex);
//            if(firstTry != -1){
//                return firstTry;
//            }else{
//                return searchDsc(mountainArr,target,peakIndex + 1, mountainArr.length() -1);
//            }
//        }
//        public int peak(MountainArray mountainArr){
//            int s = 0;
//            int e = mountainArr.length() - 1;
//            while(s<e){
//                int m = s + (e-s)/2;
//
//                if(mountainArr.get(m) > mountainArr.get(m+1)){
//                    e = m;
//                }else{
//                    s = m+1;
//                }
//            }
//            return s;
//        }
//
//        public int searchAsc(MountainArray mountainArr,int target,int start, int end){
//            while(start <= end){
//                int mid = start + (end-start)/2;
//                int midVal = mountainArr.get(mid);
//
//                if(target == midVal){
//                    return mid;
//                }
//                else if(target > midVal){
//                    start = mid +1;
//                }else{
//                    end = mid -1;
//                }
//            }
//            return -1;
//        }
//
//        public int searchDsc(MountainArray mountainArr,int target,int start, int end){
//            while(start <= end){
//                int mid = start + (end-start)/2;
//                int midVal = mountainArr.get(mid);
//
//                if(target == midVal){
//                    return mid;
//                }
//                else if(target > midVal){
//                    end = mid -1;
//                }else{
//                    start = mid +1;
//                }
//            }
//            return -1;
//        }
//    }
}
