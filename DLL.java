package LInkedList;

import org.w3c.dom.NodeList;

public class DLL {
    Node head;
    int size;
    Node tail;

    public DLL() {
        this.size = 0;
    }

    public void AddElementFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;

        }

        size++;
        head=node;
    }
    public void Display(){
        Node node=head;
        Node last=null;
        while (node!=null){
            System.out.print(node.value+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");


        System.out.println("Reverslist");
        while (last != null) {

            System.out.print(last.value+"->");
            last=last.prev;

        }
        System.out.println("START");

    }

    public void AddLast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;

        if (head==null){
            node.prev=null;
            node=head;
        }
        while (last.next!=null){
            last=last.next;

        }
        last.next=node;
        node.prev=last;
        size++;

    }

    public void Insert( int val,int index){

        Node current=head;
        for (int i=1;i<index-1;i++){
            current=current.next;

        }

        Node node=new Node(val,current.next,current.prev);
        node.next=current.next;
        current.next=node;
        node.prev=current;
        if(node.next!=null){
            node.next.prev=node;
        }


    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
