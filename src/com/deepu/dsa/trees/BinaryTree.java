package com.deepu.dsa.trees;

import java.util.Scanner;

public class BinaryTree {

  public BinaryTree(){

  }

  private class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }

  }

  private Node root;

  public void insertNode(Scanner sc){
    System.out.println("Enter root node: ");
    int value=sc.nextInt();
    root=new Node(value);
    insertNode(sc,root);
  }

  public void insertNode(Scanner sc, Node node){
    System.out.println("Do you want to add new node in left of " +node.value);
    boolean left=sc.nextBoolean();
    if(left){
      System.out.println("Enter the value you want to add in left of : "+node.value);
      int value=sc.nextInt();
      node.left=new Node(value);
      insertNode(sc,node.left);
    }

    System.out.println("Do you want to add new node in right of " +node.value);
    boolean right=sc.nextBoolean();
    if(right){
      System.out.println("Enter the value you want to add in right of : "+node.value);
      int value=sc.nextInt();
      node.right=new Node(value);
      insertNode(sc,node.right);
    }

  }

  public void display(){
    display(root,"Root node :");
  }

  private void display(Node node,String details){
    if(node == null) return;

    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right,"Right child of " + node.value + " : ");


  }





}
