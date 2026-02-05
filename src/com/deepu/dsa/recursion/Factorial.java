package com.deepu.dsa.recursion;

import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(1));
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }

    // PS :- given array and target, we have to check whether target is present in array or not.
    public static class RecursiveLinearSearch {
        public static void main(String[] args) {
            int[]  arr = {2,4,1,6,3,3,0,3};
            int target = 3;
            System.out.println(search(arr,target,0));
            System.out.println(searchIndex(arr,target,0));
            System.out.println(indexFromLast(arr,target,arr.length-1));
            allIndex(arr,target,0);
            System.out.println(arrayList);
            ArrayList<Integer> arrayList1 = findAllIndex(arr,target,0,new ArrayList<>());
            System.out.println(arrayList1);
            System.out.println(findAllIndex2(arr,target,0));
        }
        public static boolean search(int[] arr,int target,int index){
            if(index == arr.length - 1){
                return false;
            }
            return (target == arr[index] ||  search(arr,target,index+1));
        }
        public static int searchIndex(int[] arr, int target, int index){
            if(index == arr.length - 1){
                return -1;
            }
            if(target == arr[index]){
                return index;
            }else {
                return searchIndex(arr, target, index + 1);
            }
        }
        public static int indexFromLast(int[] arr, int target, int index){
            if(index == -1){
                return -1;
            }if(target == arr[index]){
                return index;
            }else{
                return indexFromLast(arr,target,index-1);
            }
        }


        static ArrayList<Integer> arrayList = new ArrayList<>();
        static void allIndex(int[] arr, int target, int index){
            if(index == arr.length ){
                return;
            }
            if(target == arr[index]) {
                arrayList.add(index);
            }
            allIndex(arr,target,index + 1);
        }

        static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> arrayList){
            if(index == arr.length){
                return arrayList;
            }
            if(target == arr[index]){
                arrayList.add(index);
            }
            return findAllIndex(arr,target,index+1,arrayList);
        }

        static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
            ArrayList<Integer> list = new ArrayList<>();
            if(index == arr.length){
                return list;
            }
            if(target == arr[index]){
                list.add(index);
            }
            ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr,target,index+1);  // Catch the previous element and store it.
            list.addAll(ansFromBelowCalls);  // now add the previous into the existing list
            return list;   // return the new list and this will again caught by ansFromBelowCalls arrayList.
        }
    }
}
