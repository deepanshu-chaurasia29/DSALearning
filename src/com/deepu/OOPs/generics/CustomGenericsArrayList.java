package com.deepu.OOPs.generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;  // this also works as index of the array

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private void reSize() {
        Object[] temp=new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }

    public T remove(int index){
        if(index < 0 || index > size-1){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }

        T removed =(T)(data[index]);

        // copy all the right side elements of array
        for(int i=index; i<size-1; i++){
            data[i] = data[i+1];
        }

        size--;  // after removing element size will get decreased
        data[size] = 0;
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
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

        CustomGenericsArrayList<Integer> list2=new CustomGenericsArrayList<>();
        list2.add(34);
        list2.add(23);
        System.out.println(list2.size);
        System.out.println(list2);

    }
}

