/*
You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N'
(if it exists). Return -1 otherwise.
*/



public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        if(head==null){
            return -1;
        }
        int count =0;
        while(head!=null){
            if(head.data==n){
                return count;
            }
            head=head.next;
            count++;
        }
        return -1;
	}
}
