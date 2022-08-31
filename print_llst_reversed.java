You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.

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
import java.util.ArrayList;
public class Solution {
	
	public static void printReverse(LinkedListNode<Integer> root) {
        if(root==null){
        return;
    }
		//Your code goes here
        ArrayList<Integer> prt = new ArrayList<>();
        while(root!=null){
          prt.add(root.data);
          root=root.next;
        }
        for(int i=prt.size()-1;i>=0;i--){
            System.out.print(prt.get(i)+" ");
        }
	}

}
