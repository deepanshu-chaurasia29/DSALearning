package com.deepu.dsa.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class MinimumInStack {
    static void main() {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(3);
        s.add(5);
        s.add(0);
        s.add(-1);

        System.out.println(Arrays.toString(s.toArray()));
        System.out.println(findMin(s));
        System.out.println(Arrays.toString(s.toArray()));

    }
    static public int findMin(Stack<Integer> s){
        if(s.isEmpty()){
            return Integer.MAX_VALUE;

        }
        int pop=s.pop();
        int min=findMin(s);

        s.push(pop);
        return Math.min(pop,min);
    }
}
