package com.deepu.dsa.LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size=0;
    }

    private class Node{
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }


    }

    // insert at first position
    public void insertFirst(int val){
        Node node=new Node(val);

        node.next=head;
        node.prev=null;
        if(head != null) {
            head.prev = node;
        }
        head=node;
        size++;


    }

    public void display(){
        Node node=head;
        while(node != null){
            System.out.print(node.val + "-> " );
            node=node.next;
        }
        System.out.println("END");
    }
}
