package com.deepu.dsa.arrays;

public class Linear_Search {
    public static void main(String[] args) {
//        int[] arr = {2,23,4,12,4,2,54,12,4,33};
//        int target = 4;
//        int ind = linearSearch(arr,target);
//        System.out.println(ind);

//        String name = "deepu";
//        char target1 = 'a';
//        boolean ans = searchString(name,target1);
//        System.out.println(ans);

        int[] arr = {2,23,4,12,4,2,54,12,4,33};
        int target = 4;
        int start = 1;
        int end = 4;
        int ind = linearSearchInRange(arr,target,start,end);
        System.out.println("Element found at index : " + ind + " Element : " + arr[ind]);


    }

    //Finding element in full int array
//    static int linearSearch(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int index = 0; index < arr.length ; index++) {
//            if(arr[index] == target){
//                return index;
//            }
//        }
//        return -1;
//    }


    // Finding a character in given string
//    static boolean searchString(String name, char target){
//        if(name.length() == 0) {
//            return false;
//        }
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) == target){
//                return true;
//            }
//        }
//        return false;
//    }

    //Search in range
    static int linearSearchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end+1 ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
