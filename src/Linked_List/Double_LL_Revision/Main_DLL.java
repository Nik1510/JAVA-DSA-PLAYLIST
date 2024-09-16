package Linked_List.Double_LL_Revision;

public class Main_DLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(69);

//        list.display();
        list.displayRev();
    }
}
