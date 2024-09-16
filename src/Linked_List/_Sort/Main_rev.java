package Linked_List._Sort;



public class Main_rev {
    public static void main(String[] args) {
        Rev_LL list = new Rev_LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
        list.insertLast2(55);
        list.display();
        list.insertLast2(57);
        list.display();
    }
}
