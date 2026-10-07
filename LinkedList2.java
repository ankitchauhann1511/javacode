public class LinkedList2 {
    public static void main(String[] args) {
       
        //int [] arr = {10,20,30,40}
        //add 5  


        //insert element at the end of the linked list
        //insert element at the first position of the linked list
        //insert element at specific location in linked list
       
        Node A = new Node();
        A.val=10;
        A.address=null;

        Node B = new Node();
        B.val=20;
        B.address=null;

        A.address=B;

        Node C = new Node();
        C.val=30;
        C.address=null;

        B.address=C;

        Node D= new Node();
        D.val=40;
        D.address=null;

        C.address=D;

        //New Node

        Node NewNode = new Node();
        NewNode.val=25;
        NewNode.address=null;

        //find middle
        Node head = A;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.address.address != null) {
            slow = slow.address;
            fast = fast.address.address;
        }

        NewNode.address=slow.address;
        slow.address=NewNode;

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.address;
        } 
        
    }

    public static class Node{
        int val;
        Node address;
    }
}
