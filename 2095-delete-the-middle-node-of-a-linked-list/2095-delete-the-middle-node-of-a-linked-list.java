/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int cnt =0;
        if (head.next == null){
            return null;
        }
        while(temp != null){
            cnt++;
            temp=temp.next;
        }
        // System.out.println(cnt);
        if(cnt%2 != 0){
            cnt=cnt-1;
        }
        temp=head;
        int mid=cnt/2;
        for(int i=0;i<mid-1;i++){
            temp =temp.next;
        }
        // System.out.println(temp.val);
        temp.next=temp.next.next;
        
         
        // temp.next.next = null;

        return head;
    }
}