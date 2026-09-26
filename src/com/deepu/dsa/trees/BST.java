package com.deepu.dsa.trees;

public class BST {

  public class Node {
    private int value;
    private int height;
    private Node left;
    private Node right;


    public Node(int value) {
      this.value = value;
    }
//    public int getValue() {
//      return this.value;
//    }
  }

  private Node root;

  public BST() {

  }

  public int height(Node node) {
    if (node == null) return -1;
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void display() {
    display(root, "Root node :");
  }

  private void display(Node node, String s) {
    if (node == null) return;

    System.out.println(s + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  private Node insert(Node node, int value) {
    if (node == null) {
      node = new Node(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(node.left, value);
    }

    if (value > node.value) {
      node.right = insert(node.right, value);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;

    return node;
  }

  public void balanceInsert(int[] arr,int s,int e){
    if(s >= e) return;

    int mid = (s+e)/2;
    this.insert(arr[mid]);
    balanceInsert(arr,s,mid);
    balanceInsert(arr,mid+1,e);
  }

  public void populate(int[] nums){
    for (int i = 0; i < nums.length ; i++) {
      this.insert(nums[i]);
    }
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null)
      return true;  // means previous node was leaf node and leaf node is always balanced bckz of no child
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  public void preOrder(){
    preOrder(root);
  }
  private void preOrder(Node node){
    if(node == null) return;
    System.out.println(node.value + " ");  // root
    preOrder(node.left);
    preOrder(node.right);
  }

  public void postOrder(){
    postOrder(root);
  }

  private void postOrder(Node node) {
    if(node == null) return;

    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value + " ");  // root

  }

  public void inOrder(){
    inOrder(root);
  }

  private void inOrder(Node node) {
    if(node == null) return;

    inOrder(node.left);
    System.out.println(node.value + " ");  // root
    inOrder(node.right);
  }


}
