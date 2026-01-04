package dev.lpa;

public class Main314 {
    public static void main(String[] args) {
        Main314 node =new Main314();
        node.addFirst(1);
        node.addLast(2);
        node.addLast(3);
        node.addLast(4);
        node.addLast(5);
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
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
