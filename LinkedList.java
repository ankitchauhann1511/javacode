import org.w3c.dom.Node;

public class LinkedList {
    public static void main(String[] args) {
       
        //int [] arr = {10,20,30,40}
        //add 5  

        //insert element at the end of the linked list
        //insert element at the first position of the linked list
        //insert element at specific location in linked list
       
        
        Node A = new Node();
        A.val = 5;
        A.address=null;

        Node B = new Node();
        B.val = 2;
        B.address = null;

        A.address = B;

        Node C = new Node();
        C.val = 8;
        C.address = null;

        B.address = C;

        Node D = new Node();
        D.val = 4;
        D.address = null;

        C.address = D;

        Node head = A;

        // Sorting
        Node current = head;

        while(current != null) {
            Node temp = current.address;

            while(temp != null) {
                if(current.val > temp.val) {
                    int swap = current.val;
                    current.val = temp.val;
                    temp.val = swap;
                }
                temp = temp.address;
            }
            current = current.address;
        }

        Node print = head;
        while(print!= null) {
            System.out.print(print.val + " ");
            print = print.address;
        }
       Nodee nc=new Nodee(120,null);
       System.out.println(nc.val);
    }

    public static class Node{
        int val;
        Node address;

    }
        public static class Nodee{
        int val;
        Nodee address;
        public Nodee(int val , Nodee ad){
            this.val=val;
            this.address=ad;
        }
    }
    
}