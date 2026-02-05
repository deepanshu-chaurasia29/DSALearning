package com.deepu.basics.mix;


public class Max_Item_Array {
    public static void main(String[] args) {
        int[] arr = {};
        int max = max(arr);
        System.out.println("Max element in array :" + max);
        int max_new = maxInRange(arr,2,8);
        System.out.println("Max element in Range array : " + max_new);
    }
    static int max(int[] array){
        if(array.length != 0) {
            int m = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > m) {
                    m = array[i];
                }
            }
            return m;
        }else{
            System.out.println("Empty array");
        }
        return 0;
    }

    static int maxInRange(int[] array, int i, int j){
        if (array.length != 0) {
            int max = array[i];
            for (int start = i; i < j + 1; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
        else{
            System.out.println("Empty array");
        }
        return 0;
    }
}
