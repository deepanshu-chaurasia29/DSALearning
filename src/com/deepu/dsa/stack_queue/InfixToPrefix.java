package com.deepu.dsa.stack_queue;

import java.util.Stack;

public class InfixToPrefix {
  static void main() {
    String s="a+((b*c)/d)-(e*d)";
    System.out.println(infixToPrefix(s));
  }
  public static String infixToPrefix(String s){
    Stack<Character> st=new Stack<>();
    int i=0;
    StringBuilder sb=new StringBuilder();

    String rev="";
    for(int j=s.length()-1; j>=0; j--){
      char ch=s.charAt(j);
      if(ch == ')') rev += '(';
      else if(ch == '(') rev += ')';
      else rev += ch;
    }



    while(i < rev.length()){
      // operand
      char ch=rev.charAt(i);

      // add operand to answer
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
      else{
        while(!st.isEmpty() && (priority(st.peek()) >= priority(ch) && ch == '^') ){
          sb.append(st.pop());
        }
        st.push(ch);
      }
      i++;
    }
    while(!st.isEmpty()){
      sb.append(st.pop());
    }

    return sb.reverse().toString();
  }


  private static int priority(char peek) {
    if(peek == '^') return 3;
    else if(peek == '*' || peek == '/' || peek == '%') return 2;
    else if(peek == '+' || peek == '-') return 1;
    else return -1;
  }
}
