package Linked_List.All_Code;



public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node() {
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static LL mergeKunal(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // find the length of the cycle

    // Amazon and Mircosoft
    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;

            while(fast == slow ){
                // calculate the length
                Node temp =slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp!= slow);
                return length;
            }
        }
        return 0;
    }
    static int findsquare(int n){
        int s =0;
        while(n>0){
            int digit =n%10;
            s+=digit*digit;
            n/=10;
        }
        return s;
    }
    static boolean isHappy(int n ){
        int slow = n;
        int fast = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while (slow!= fast);

        if (slow ==1){
            return true;
        }
        return false;
    }

    public static LL  merge(LL first , LL second ){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f!= null && s != null){
            if (f.value <s.value){
                ans.insertLast(f.value);
                f= f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f!= null){
            ans.insertLast(f.value);
            f= f.next;
        }
        while (s!= null){
            ans.insertLast(s.value);
            s= s.next;
        }
        return ans;
    }
    public Node detectCycle(Node head) {
        int length =0 ;
        Node fast = head;
        Node slow = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if (length ==0){
            return null;
        }
        // find the start Node

        Node f = head;
        Node s = head;

        while (length>0){
            s= s.next;
            length--;
        }

        // keep moving both forward and then they will meet at cycle start
        while (f!=s){
            f= f.next;
            s= s.next;
        }
        return s; // return any as no they are pointing to same element
    }


    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // recursion reverse : - IMPORTANT
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public Node middleNode(Node head){
        Node s = head;
        Node f= head;
        while( f!= head && s!= head){
            s =s.next;
            f = f.next.next;
        }
        return s;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }


    // linkedin, google , microsoft , etc
//    q:_234
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node reReverse = headSecond;

        // compare both the halves

        while (head!= null && headSecond!= null){
            if (head.value!=headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reReverse);

        return head ==null || headSecond ==null;
    }

    // q:- 143
    public void reorderList(Node head){
            if (head==null){
                return;
            }
            Node mid = middleNode(head);
            Node headSecond = reverseList(mid);
            Node headFirst = head;

            // rearrange
        while (headFirst!= null && headSecond!=null){
            Node temp = headFirst.next;
            headFirst.next =headSecond;
            headFirst =temp;

            temp =headSecond.next;
            headSecond.next =headFirst;
            headSecond=temp;
        }
        // next of tail to null
        if (headFirst!=null){
            headFirst.next =null;
        }
    }

    private Node reverseList(Node mid) {
        if (head==null){
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present!=null){
            present.next =prev;
            prev =present;
            present =next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev; // while reversing the head is at prev
    }

    // google, amazon, microsoft :
    // it is also revering the <k and items  -> modify it accordingly
    public Node  reverseKGroup(Node head, int k){
        if (k<=1 || head ==null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while (true){

            Node last = prev;
            Node newEnd = current;

            // reverse between left and right

            Node next = current.next;

            for (int i = 0; current!=null && i < k; i++) {
                current.next =prev;
                prev= current;
                if (next!=null){
                    next= next.next;
                }
            }
            if (last != null){
                last.next =prev;
            }
            else {
                head= prev;
            }
            newEnd.next = current;

            if (current==null){
                break;
            }
            prev = newEnd;
        }
        return head;

    }

    public Node rotateRight(Node head, int k){
        if (k<=0 ||head ==null || head.next ==null){
            return head;
        }

        Node last = head;
        int length =1;
        while (last.next!=null){
            last = last.next;
            length++;
        }

        last.next =head;
        int rotations = k %length;
        int skip = length-rotations;
        Node newLast = head;
        for (int i = 0; i <skip-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next=null;

        return head;
    }

    public static void main(String[] args) {
//         --- Duplicate ------
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.display();
//        list.duplicates();
//        list.display();

//        =---- MergeSort------

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);


        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

//
//        LL ans = LL.merge(first, second);
//        ans.display();
//        System.out.println(isHappy(19));
//        System.out.println(first);

        LL list = new LL();
        for (int i = 7; i >0; i--) {
        list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}

