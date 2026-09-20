package com.deepu.dsa.stack_queue;

import java.util.Stack;

public class PrefixToInfix {
  static void main() {
    String s="*+PQ-MN";
    System.out.println(prefixToInfix(s));
  }

  static String prefixToInfix(String s) {
    Stack<String> st = new Stack<>();
    int i = s.length()-1;

    while (i >= 0) {
      char ch = s.charAt(i);
      if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
        st.push(ch + "");
      } else {

        String t1 = st.pop();
        String t2 = st.pop();
        String result="(" + t1 + ch + t2 + ")";
        st.push(result);
      }
      i--;
    }

    return st.peek();
  }
}
