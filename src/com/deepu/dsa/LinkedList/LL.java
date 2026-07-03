package com.deepu.dsa.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    // Insert an element in LL
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        // It means the very first element is added
        if(tail==null){
            tail=head;
        }
        size++;
    }
    // Insert at last
    public void insertLast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;

        if(head==null){
            head=tail;
        }
        size++;
    }
    //Delete






    //Search







    // Print all elements of LL
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}
