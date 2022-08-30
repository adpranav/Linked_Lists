/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> temp = head;
        int count=0;
        while(temp!=null && count!=pos-1){ // till this
            temp=temp.next;
            count++;
        }
        if(temp!=null){   // please consider the case where the position can be out of the range of the linked list.
          newNode.next=temp.next;
        temp.next=newNode;  
        }
        
        return head;
	}
}
