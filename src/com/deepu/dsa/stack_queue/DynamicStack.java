package com.deepu.dsa.stack_queue;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();  // this will call to parent class constructor that takes zero parameter i.e, CustomStack()
    }

    public DynamicStack(int size) {
        super(size);  // this will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) throws StackException {
        // if array became full, it will be handled here
        if(this.isFull()){
            // double the array size
            int[] temp=new int[data.length * 2];

            // copy all the previous items in new data
            for(int i=0; i<data.length; i++){
                temp[i]=data[i];
            }

            data=temp;  // changing the reference of data to temp

        }

        // if flows comes here, means array is not full yet.
        // add the current item directly.

        //  insert the item
        return super.push(item);
    }
}
