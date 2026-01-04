package dev.lpa;

public class Main316 {
    public static void main(String[] args) {
        Main316 ll=new Main316();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        ll.head.next.next.next.next=new Node(5);

//        printll(head);
        System.out.println("----");
        reverseLL();
        printll(head);

    }
    public static void reverseLL(){
        if(head==null){
            return;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void deleteFirst(Node head){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public static void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
