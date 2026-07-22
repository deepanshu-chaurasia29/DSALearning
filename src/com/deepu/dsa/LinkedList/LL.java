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
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }



    // Insert at first position in LL
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

    // Insert at last position
    public void insertLast(int val){

        if(head == null){
            // means first element hai ye, so sidhe add kar do isko first position or
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;

//        if(head==null){
//            head=tail;
//        }
        size++;
    }

    // Print all elements of LL
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // delete from first of LL
    public int deleteFirst(){
        int val=head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // returns the node before the given index
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete from last of LL
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast=get(size-2); // return the second last node
        int value=tail.data;
        tail = secondLast;
        tail.next=null;
        size--;

        return value;
    }

    // delete from given index
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node temp=get(index-1);
        int val=temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    // returns Node of the given value
    public Node getNode(int value){
        Node tempNode=head;
        while(tempNode != null){
            if(tempNode.data == value){
                return tempNode;
            }
        }
        return null;
    }


    // insert element at given index
    public void insert(int val,int index){
        if(index > size){
            try {
                throw new Exception("illegal addition");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        // when you come from this loop, you will point to previous node after after which new node is to be inserted

        Node node=new Node(val,temp.next);
        temp.next = node;
        size++;
    }
}
