package Linked_List.Custom_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertFirst(25);
        LL.insertFirst(20);
        LL.insertFirst(15);
        LL.insertFirst(10);
        LL.insertFirst(5);
        LL.display();
        LL.insertLast(85);
        LL.display();
        LL.insertLast2(95);
        LL.display();
        LL.insertAny(35, 2);
        LL.display();


    }
}
