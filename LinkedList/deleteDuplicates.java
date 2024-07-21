
class Solution {
    public ListNode deleteDuplicates(ListNode str) {
        ListNode head =str;
        if (str == null){
            return str;
        }
        while(str.next != null){
         if ( str.val==str.next.val){
            str.next = str.next.next;
           
         }   
         else {
                str = str.next;
            } }
         return head; 
    }
}
