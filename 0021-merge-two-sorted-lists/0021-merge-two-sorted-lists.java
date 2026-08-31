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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

if(l1 ==null) return l2;
if(l2==null) return l1;
ListNode dummy= new ListNode(-1);


ListNode temp=dummy;
while(l1 != null && l2 != null){
    if(l1.val<=l2.val){
        temp.next=l1;
        l1=l1.next;
    }else{
        temp.next=l2; 
        
        l2=l2.next;
    }temp=temp.next;

}
if(l1 != null){
    temp.next=l1;
}else{
    temp.next=l2;
}
return dummy.next;


/* if(l1==null)   return l2;
 if(l2==null) return l1;
    

        
        ListNode head;
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode tail = head;

        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

    
        if (l1 != null) tail.next = l1;
        else tail.next = l2;

        return head;

*/


    }
}