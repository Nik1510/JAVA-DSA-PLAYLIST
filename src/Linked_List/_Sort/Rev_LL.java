package Linked_List._Sort;

public class Rev_LL {

    private Node head; // pointing to starting of the node
    private Node tail; // pointing to end of the node
    private int size;

    public Rev_LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val); // creating a new box which will contain the value
        node.next = head;
        head = node;
        if (tail == null){
            // this mean it is the first element being added
            tail = head;
        }
        size+=1;
    }

    public void insertLast2(int val){
        // here i am using tail pointer
        if (tail== null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail= node;
        size++;
    }
    public void insert(int val, int index){

    }

    public void  display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


}

