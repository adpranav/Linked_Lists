/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        if(pos==0){
            head=head.next;
            return head;
        }
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> temp = head;
        int count=0;
        while(temp!=null && count!=pos-1){
            temp=temp.next;
            count++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
	}
}
