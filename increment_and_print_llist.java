class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class Lineked_List_use {
     public static Node create_llst(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void increment(Node head){
        while(head!=null){
            head.data++;
            head=head.next;
        }
    }
    public static void printllst(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = create_llst();
        increment(head);
        printllst(head);

    }
}
