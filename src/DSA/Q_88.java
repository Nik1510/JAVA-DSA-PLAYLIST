package DSA;

public class Q_88 {

    private Node head;
    private Node tail ;
    private int size;

    public Q_88() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head= node;
        if (tail==null){
            tail = head;
        }
        size++;
    }
    public void removeDulipcate(){
        Node node = head;
        while (node.next!=null){
            if ( node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }else{
                node= node.next;
            }
            tail = node;
            tail.next =null;
        }

    }
    public void display(){
        Node temp = head;
        while (temp != null ) {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }

   private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node (int val, Node next){
            this.val=val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Q_88 n = new Q_88();
        n.insertFirst(4);
        n.insertFirst(3);
        n.insertFirst(3);
        n.insertFirst(2);
        n.insertFirst(2);
        n.insertFirst(1);
        n.insertFirst(1);
        n.insertFirst(1);
        n.insertFirst(1);

        System.out.println("Before removing duplicates:");
        n.display();

        System.out.println("After removing duplicates:");
       n.removeDulipcate();
        n.display();
    }
}
