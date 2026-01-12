package dev.lpa;

public class Main331 {
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        int[] arr={3,5,6,8,10,11,12};
        for (int i = 0; i < arr.length; i++) {
            insert(root,arr[i]);
        }
        inOrder(root);
    }

    public static Node insert(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static class Node {
        int data;
        Node left, right;
        public Node(int data){
            this.data=data;
        }
    }
}
