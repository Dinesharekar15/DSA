package LInkedList;

import org.w3c.dom.Node;

  public class LL {

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    int size;
    Node head;
    Node tail;

    public LL() {
        this.size = 0;
    }

    public void AddElementFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        while (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void AddLast(int value) {
        if (tail == null) {
            AddElementFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size += 1;

    }

    public void Insert(int val, int index) {
        if (size == 0) {
            AddElementFirst(val);
            return;
        }
        if (index == size) {
            AddLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public int DeleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    public Node Get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
         return node;
    }

    public int DeleteLast() {
        if (size <= 1) {
            return  DeleteFirst();

        }
        Node secondlast = Get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;


    }


    public int  Delete( int index){

        if(index==0){
           return DeleteFirst();

        }
        if(index==size-1){
            return DeleteLast();
        }
        Node node=Get(index-1);
        int val=node.next.value;
        node.next=node.next.next;
        size--;
        return val;
    }


    public Node FindNode(int value){
        Node node=head;
        int index=0;
        while (node!=null){

            if (node.value==value){
                System.out.println(index);
                return node;
            }
            node=node.next;
            index ++;
        }


        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
