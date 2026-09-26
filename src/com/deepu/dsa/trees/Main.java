package com.deepu.dsa.trees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static void main() {
//    Scanner sc=new Scanner(System.in);
//    BinaryTree tree=new BinaryTree();
//    tree.insertNode(sc);
//    tree.display();

    int[] nums = {4,2,7,3,8,9,0,98,65,-9,54,33,21,90};

    BST tree1=new BST();
    tree1.populate(nums);
    tree1.display();
    System.out.println(tree1.balanced());

    BST tree2=new BST();
    Arrays.sort(nums);
    tree2.balanceInsert(nums,0, nums.length);
    tree2.display();
    System.out.println(tree2.balanced());
  }
}
