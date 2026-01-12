package dev.lpa;

public class Main330 {
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        System.out.println(searchBST(root,9));
    }

    public static boolean searchBST(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data<key){
            return searchBST(root.right,key);
        } else if (root.data > key) {
            return searchBST(root.left,key);
        }
        return true;
    }

    public static class Node {
        int data;
        Node left, right;
        public Node(int data){
            this.data=data;
        }
    }
}
