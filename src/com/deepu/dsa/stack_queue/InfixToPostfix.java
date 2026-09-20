package com.deepu.dsa.stack_queue;

import java.util.Stack;

public class InfixToPostfix {
  static void main() {
    String s="a+((b*c)/d)-(e*d)";
    System.out.println(infixToPostfix(s));
  }
  public static String infixToPostfix(String s){
    Stack<Character> st=new Stack<>();
    int i=0;
    StringBuilder sb=new StringBuilder();
    while(i < s.length()){
      // operand
      char ch=s.charAt(i);

      if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
        sb.append(ch);
      }
      else if(ch == '('){
        st.push(ch);
      }
      else if(ch == ')'){
        while(!st.isEmpty() && st.peek() != '('){
          sb.append(st.pop());
        }
        st.pop(); // remove open bracket
      }
      // operator
      else{
        while(!st.isEmpty() && (precedence(st.peek()) >= precedence(ch) && ch != '^') ){
          sb.append(st.pop());
        }
        st.push(ch);
      }
      i++;
    }
    while(!st.isEmpty()){
      sb.append(st.pop());
    }

    return sb.toString();
  }



  private static int precedence(char peek) {
    if(peek == '^') return 3;
    else if(peek == '*' || peek == '/' || peek == '%') return 2;
    else if(peek == '+' || peek == '-') return 1;
    else return -1;
  }

}
