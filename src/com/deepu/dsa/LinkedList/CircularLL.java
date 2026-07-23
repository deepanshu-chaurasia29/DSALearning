package com.deepu.dsa.LinkedList;

public class CircularLL {

    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    private class Node{
        private int val;
        private Node next;
        private Node tail;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head == null){
            // empty circular linked list hai
            head = node;
            tail = node;
            return;
        }

        tail.next = node;  // tail.next means break the previous connection and connect tail to node
        node.next = head;  // establish the connection between new node and head node
        tail = node; // update the tail now

    }

    public void display(){
        Node node=head;
        do {
            System.out.print(node.val + "-> ");
            node = node.next;
        } while(node.next != head);

        System.out.println("END");
    }

    public void delete(int val){
        Node node=head;
        if(head == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        // if deleted from inside
        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node != head);
    }


}
