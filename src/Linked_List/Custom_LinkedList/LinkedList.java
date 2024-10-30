package Linked_List.Custom_LinkedList;

import Linked_List._Leetocode.ListNode;

public class LinkedList {

    private Node head;
    private Node tail;
    private  int size;


    public  LinkedList(){
        this.size=0;
    }

    public void insertFirst (int val ){
        Node node = new Node(val); // create a new Node
        node.next = head;
        head=node;
        if (tail == null){
            tail = head; // first item being added
        }
        size+=1;

    }


    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }

    public void  insertLast2(int val){
        Node temp = head;
        while(temp.next!=null && temp!=null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next=node;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node (val,temp.next);
        temp.next = node;

    }
    public void insertAny(int val, int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        int length=0;
        Node newNode = new Node(val);
        Node temp = head;
        while(temp!=null && temp.next!=null && length<index-1){
            temp=temp.next;
            length++;
        }
       newNode.next = temp.next; // connecting new node to next node
        temp .next =newNode; // make new connection of excting new node to next node

    }

    public int deleteFirst(){
       int val = head.value;
       head = head.next;
       if (head==null){
           tail= null;
       }
       size--;
       return val;
    }

    public int deleteLast(){
        if (size==1){
            return deleteFirst();
        }
        Node secondLast =get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int deleteAny(int index){
        if (index == 0){
            return deleteFirst();

        }
        if (index==size-1){
            return deleteLast();
        }
        Node elementBeforeDeleteElement = get(index-1);
        int val = elementBeforeDeleteElement.next.value;
        elementBeforeDeleteElement.next=elementBeforeDeleteElement.next.next;
        return val;
    }


    // insert using recursion
     // what should the person should see
    public void insertRec(int val , int index){
    head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if (index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index,node.next);
        return node;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp= temp.next;
        }
        System.out.println("End");
    }
     private class Node{
         private int value;
         private  Node next;

         public Node(int value) {
             this.value = value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }
     }
}
