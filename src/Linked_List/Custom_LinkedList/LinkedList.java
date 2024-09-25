package Linked_List.Custom_LinkedList;

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
       newNode.next = temp.next;
        temp .next =newNode;

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
