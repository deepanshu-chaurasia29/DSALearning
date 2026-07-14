package com.deepu.OOPs.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;  // this also works as index of the array

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    private void reSize() {
        int[] temp=new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public void add(int num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }

    public int remove(int index){
        if(index < 0 || index > size-1){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }

        int removed=data[index];

        // copy all the right side elements of array
        for(int i=index; i<size-1; i++){
            data[i] = data[i+1];
        }

        size--;  // after removing element size will get decreased
        data[size] = 0;
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main() {
//        CustomArrayList list=new CustomArrayList();
//        list.add(12);
//        list.add(2);
//        list.remove(1);
//        list.set(4,89);
//        System.out.println(list);
        System.out.println((-11) % 2);
    }
}
