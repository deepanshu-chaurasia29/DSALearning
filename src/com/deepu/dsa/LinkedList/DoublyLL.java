package com.deepu.dsa.LinkedList;

public class DoublyLL {
    private Node head;
//    private Node tail;
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

    // insert at last
    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;


        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        node.next=null;
        node.prev = last;
        last.next = node;
        size++;
    }

    // insert new node after given node value
//    public void insert(int val,int preVal){
//        // val - jisko insert kar rhe hai
//        // preVal - jiske aage insert karna hai
//        Node node=new Node(val);
//        Node current=head;
//        if(current.next == null){
//            insertLast(val);
//        }
//
//
//        while(current.val != preVal){
//            current = current.next;
//        }
//        // when the while loop break, current will point to the given node
//        Node next=current.next;
//
//        // ab bas connect karna hai dono pointer ko new node k saath
//        current.next = node;
//        node.prev = current;
//        node.next = next;
//        next.prev = node;
//        size++;
//    }

    public Node getNode(int val){
        Node tempNode=head;
        while(tempNode != null){
            if(tempNode.val == val){
                return tempNode;
            }
            tempNode = tempNode.next;
        }
        return null;
    }

    public void insert(int value,int preVal){
        Node prevNode=getNode(preVal);
        if(prevNode == null){
            System.out.println("does not exist");
            return;
        }

        Node node=new Node(value);
        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next = node;
        // may be node.next null
        if(node.next != null){
            node.next.prev=node;
        }

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
