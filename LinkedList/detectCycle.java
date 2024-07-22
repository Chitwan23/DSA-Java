/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        ListNode temp =head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s= s.next;
            if(f==s){
                while(temp!=s){
                    temp= temp.next;
                    s= s.next;
                }
                return temp;
                
            }
        }
        return null;
    }
}
