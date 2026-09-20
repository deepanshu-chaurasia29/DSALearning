package com.deepu.dsa.stack_queue;

import java.lang.classfile.instruction.StackInstruction;
import java.util.Stack;

public class PostfixToInfix {
  static void main() {
    System.out.println(postfixToInfix("AB-DE+F*/"));
  }
  static String postfixToInfix(String s){
    Stack<String> st=new Stack<>();
    int i=0;
    while(i < s.length()){
      char ch=s.charAt(i);
      if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
        st.push(ch+"");
      }else{
        if(!st.isEmpty()) {
          String o1 = st.pop();
          String o2 = st.pop();
          st.push("(" + o2 + ch + o1 +")" );
        }

      }
      i++;
    }
    StringBuilder sb=new StringBuilder();
    while(!st.isEmpty()){
      sb.append(st.pop());
    }

    return sb.toString();
  }
}
