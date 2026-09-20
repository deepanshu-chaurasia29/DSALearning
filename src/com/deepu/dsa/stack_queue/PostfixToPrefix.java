package com.deepu.dsa.stack_queue;

import java.util.Stack;

public class PostfixToPrefix {
  static void main() {
    System.out.println(postfixToPrefix("ABC*D/+ED*-"));
  }

  static String postfixToPrefix(String s) {
    Stack<String> st = new Stack<>();
    int i = 0;

    while (i < s.length()) {
      char ch = s.charAt(i);
      if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
        st.push(ch + "");
      } else {

        String o1 = st.pop();
        String o2 = st.pop();
        st.push(ch+ o2 + o1 );

      }
      i++;
    }
    StringBuilder sb = new StringBuilder();
    while (!st.isEmpty()) {
      sb.append(st.pop());
    }

    return sb.toString();
  }
}
