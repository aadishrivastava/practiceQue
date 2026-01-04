package dev.lpa;

public class Main317 {
    public static void main(String[] args) {
        Main317 ll=new Main317();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        ll.head.next.next.next.next=new Node(5);
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
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
